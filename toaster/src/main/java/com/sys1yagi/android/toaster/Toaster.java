package com.sys1yagi.android.toaster;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    private static Context APPLICATION_CONTEXT;

        public static void plugInOutlet(Context context) {
        APPLICATION_CONTEXT = context.getApplicationContext();
    }

    public static void unplug() {
        APPLICATION_CONTEXT = null;
    }

    public static void pon(String message){
        Toast.makeText(APPLICATION_CONTEXT, message, Toast.LENGTH_SHORT).show();
    }
}
