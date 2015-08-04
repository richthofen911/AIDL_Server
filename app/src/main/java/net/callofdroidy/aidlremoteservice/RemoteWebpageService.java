package net.callofdroidy.aidlremoteservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class RemoteWebpageService extends Service {
    public RemoteWebpageService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private class MyBinder extends RemoteWebpage.Stub{
        @Override
        public String getCurrentPageUrl() throws RemoteException{
            return "https://www.google.ca";
        }
    }
}
