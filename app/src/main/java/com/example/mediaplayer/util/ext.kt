package com.example.mediaplayer.util.ext

var homeConstructing = true
var songConstructing = false
var playlistConstructing = true
var libraryConstructing = true
var settingsConstructing = true

var curToast = "default"

data class Perms(
    val permission: String,
    val requestId: Int = 130,
    val msg: String? = null
)
