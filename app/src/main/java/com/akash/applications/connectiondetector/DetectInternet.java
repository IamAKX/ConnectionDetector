package com.akash.applications.connectiondetector;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;

/**
 * Created by akash on 16/2/17.
 */

public class DetectInternet {

    private Context _context;

    public DetectInternet(Context _context) {
        this._context = _context;
    }

    private  boolean isConnected(View v, String message)
    {
        boolean state = false;

        ConnectivityManager connectivity = (ConnectivityManager) _context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null)
        {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (NetworkInfo anInfo : info)
                    if (anInfo.getState() == NetworkInfo.State.CONNECTED) {
                        state = true;
                    }
        }
        if(!state)
            StateMessageDisplay.showMessageSnackBar(v,message);

        return state;
    }

}
