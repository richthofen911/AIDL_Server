package net.callofdroidy.aidlremoteservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import net.callofdroidy.aidldemo.aidl.RemoteWebPage;

public class RemoteWebPageService extends Service {
    public RemoteWebPageService() {
    }

    @Override
    public void onCreate(){
        Log.e("service created", "");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.e("service started", "");
        Log.e("start intent: ", intent.getPackage());
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.e("server side bound", "");
        return new RemoteWebPage.Stub(){
            public String getCurrentPageUrl() throws RemoteException{
                return "https://www.google.ca";
            }
        };
    }
}
