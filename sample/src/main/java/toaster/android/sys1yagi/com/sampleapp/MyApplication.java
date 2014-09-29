package toaster.android.sys1yagi.com.sampleapp;

import com.sys1yagi.android.toaster.Toaster;

public class MyApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Toaster.initialize(this);
    }
}
