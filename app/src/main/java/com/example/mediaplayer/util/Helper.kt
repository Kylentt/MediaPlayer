package com.example.mediaplayer.util

import android.os.Build

object VersionHelper {
    fun isNougat() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N     // Nougat       7.0     24
    fun isNMR() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1    // Nougat       7.1     25
    fun isOreo() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O       // Oreo         8.0     26
    fun isOMR() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1    // Oreo         8.1     27
    fun isPie() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.P        // Pie          9.0     28
    fun isQ() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q          // Q            10      29
    fun isR() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.R          // Red Velvet   11      30
    fun isSnowCone() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S   // Snow Cone    12
}

object Version {
    fun isNougat() = Build.VERSION.SDK_INT == Build.VERSION_CODES.N     // Nougat       7.0     24
    fun isNMR() = Build.VERSION.SDK_INT == Build.VERSION_CODES.N_MR1    // Nougat       7.1     25
    fun isOreo() = Build.VERSION.SDK_INT == Build.VERSION_CODES.O       // Oreo         8.0     26
    fun isOMR() = Build.VERSION.SDK_INT == Build.VERSION_CODES.O_MR1    // Oreo         8.1     27
    fun isPie() = Build.VERSION.SDK_INT == Build.VERSION_CODES.P        // Pie          9.0     28
    fun isQ() = Build.VERSION.SDK_INT == Build.VERSION_CODES.Q          // Q            10      29
    fun isR() = Build.VERSION.SDK_INT == Build.VERSION_CODES.R          // Red Velvet   11      30
    fun isSnowCone() = Build.VERSION.SDK_INT == Build.VERSION_CODES.S   // Snow Cone    12
}

data class Perms(
    val permission: String,
    val requestId: Int = 130,
    val msg: String? = null
)