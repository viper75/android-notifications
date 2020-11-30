package org.viper75.android_notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Objects;

public class MyBroadcastReceiver extends BroadcastReceiver {
    public final static String EXTRA_NOTIFICATION_ID = "notificationId";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(MyBroadcastReceiver.class.getSimpleName(), "MSG: " + Objects.requireNonNull(intent.getIntExtra(EXTRA_NOTIFICATION_ID, 0)));
    }
}
