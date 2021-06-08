package com.example.sandclock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;

public class Alarm extends BroadcastReceiver {

    static MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {

        mp=MediaPlayer.create(context, Settings.System.DEFAULT_ALARM_ALERT_URI);
        mp.start();
        Intent myIntent = new Intent(context, Alarmring.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(myIntent);
    }
    public static void stopAudio(){
        mp.stop();
    }
}