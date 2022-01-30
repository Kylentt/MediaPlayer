package com.example.mediaplayer.exoplayer.callbacks

import android.app.Notification
import android.content.Intent
import android.media.browse.MediaBrowser
import android.support.v4.media.MediaBrowserCompat
import androidx.core.content.ContextCompat
import com.google.android.exoplayer2.ui.PlayerNotificationManager
import com.example.mediaplayer.exoplayer.MusicService
import com.example.mediaplayer.exoplayer.MusicServiceConnector
import com.example.mediaplayer.util.Constants.MEDIA_ROOT_ID
import com.example.mediaplayer.util.Constants.NOTIFICATION_ID
import javax.inject.Inject

class MusicPlayerNotificationListener(
    private val musicService: MusicService,
    private val serviceConnector: MusicServiceConnector
) : PlayerNotificationManager.NotificationListener {

    override fun onNotificationCancelled(notificationId: Int, dismissedByUser: Boolean) {
        super.onNotificationCancelled(notificationId, dismissedByUser)
        musicService.apply {
            stopForeground(true)
            isForegroundService = false
            stopSelf()
            serviceConnector.unsubscribe(MEDIA_ROOT_ID, object: MediaBrowserCompat.SubscriptionCallback() {})
        }
    }

    override fun onNotificationPosted(
        notificationId: Int,
        notification: Notification,
        ongoing: Boolean
    ) {
        super.onNotificationPosted(notificationId, notification, ongoing)
        musicService.apply {
            if(ongoing && !isForegroundService) {
                ContextCompat.startForegroundService(
                    this,
                    Intent(applicationContext, this::class.java)
                )
                this.startForeground(NOTIFICATION_ID, notification)
                isForegroundService = true
            }
        }
    }
}











