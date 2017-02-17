package com.akash.applications.connectiondetector;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.view.View;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by akash on 16/2/17.
 */

public class DetectHotspot {
    Context context;

    public DetectHotspot(Context context) {
        this.context = context;
    }

    private boolean isConnected(View v, String messag)
    {
        final WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        final Method method;
        try {
            method = wifi.getClass().getDeclaredMethod("isWifiApEnabled");
            method.setAccessible(true);
            return (Boolean) method.invoke(wifi);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        StateMessageDisplay.showMessageSnackBar(v, messag);
        return false;
    }
}
