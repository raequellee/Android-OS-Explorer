package com.example.tugaskelompok1

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.BatteryManager
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ArsitekturFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_arsitektur, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvDeviceInfo: TextView = view.findViewById(R.id.tvDeviceInfo)

        val versiAndroid = Build.VERSION.RELEASE
        val modelHp = Build.MODEL
        val pembuat = Build.MANUFACTURER
        val kernelVersion = System.getProperty("os.version") ?: "Tidak diketahui"

        var batteryLevel = "0"
        try {
            val batteryManager = requireContext().getSystemService(Context.BATTERY_SERVICE) as BatteryManager
            batteryLevel = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY).toString()
        } catch (e: Exception) {
            batteryLevel = "Tidak terdeteksi"
        }

        var statusJaringan = "Offline"
        try {
            val cm = requireContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkCapabilities = cm.getNetworkCapabilities(cm.activeNetwork)
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                    statusJaringan = "Wi-Fi Terhubung"
                } else if (networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                    statusJaringan = "Cellular Terhubung"
                }
            }
        } catch (e: Exception) {
            statusJaringan = "Izin Ditolak / Offline"
        }

        val infoTeks = """
            Android Versi : $versiAndroid
            Model         : $modelHp
            Produsen      : $pembuat
            Kernel        : $kernelVersion
            Baterai       : $batteryLevel%
            Jaringan      : $statusJaringan
        """.trimIndent()

        tvDeviceInfo.text = infoTeks
    }
}