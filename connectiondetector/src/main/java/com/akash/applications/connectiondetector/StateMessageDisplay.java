package com.akash.applications.connectiondetector;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.view.View;
import android.support.design.widget.Snackbar;

/**
 * Created by akash on 16/2/17.
 */

public class StateMessageDisplay {

    public static void showMessageSnackBar(View v, String msg)
    {
        Snackbar.make(v,msg, Snackbar.LENGTH_LONG)
                .setAction("Action",null).show();
    }

    public static void ShowWiFiMessageWithAction(View v, String message, final Context context)
    {
        Snackbar.make(v,message, Snackbar.LENGTH_LONG)
                .setAction("TURN ON", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
                        wifi.setWifiEnabled(true);
                    }
                }).show();
    }

}
