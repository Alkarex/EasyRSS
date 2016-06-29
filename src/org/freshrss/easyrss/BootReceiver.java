package org.freshrss.easyrss;

import org.freshrss.easyrss.network.NetworkUtils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		NetworkUtils.startSyncingTimer(context);
	}

}
