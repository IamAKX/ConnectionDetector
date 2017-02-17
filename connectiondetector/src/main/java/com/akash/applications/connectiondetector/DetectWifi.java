package com.akash.applications.connectiondetector;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.view.View;

/**
 * Created by akash on 16/2/17.
 */

public class DetectWifi {
    Context _context;

    public DetectWifi(Context _context) {
        this._context = _context;
    }

    private boolean isConnected(View v, String message, boolean showAction)
    {
        WifiManager wifi = (WifiManager)_context.getSystemService(Context.WIFI_SERVICE);
        if (wifi.isWifiEnabled())
        {
            return true;
        }
        else
        {
            if(showAction)
                StateMessageDisplay.ShowWiFiMessageWithAction(v, message, _context);
            else
                StateMessageDisplay.showMessageSnackBar(v, message);
        }
        return false;
    }
}
