package com.example.customthumbsize

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class ReminderBroadcast  : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        val builder : NotificationCompat.Builder = NotificationCompat.Builder(context!!, "notifyChannel")
            .setSmallIcon(R.drawable.ic_baseline_airplanemode_active_24)
            .setContentTitle("Title for this notification")
            .setContentText("Text inside this notification, !! ! ! ! ! ! ! !")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        val notificationManager = NotificationManagerCompat.from(context)

        notificationManager.notify(200, builder.build())
    }

}