package com.practice.olegtojgildin.aidlpractice_meet_13;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by olegtojgildin on 24/01/2019.
 */

public class DataService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new IDataInterface.Stub() {
            @Override
            public String getDataText() throws RemoteException {
                DataStorage dataStorage = new DataStorage(getApplicationContext());
                return dataStorage.getDataText();
            }

            @Override
            public void saveDataText(String text) throws RemoteException {
                DataStorage dataStorage = new DataStorage(getApplicationContext());
                dataStorage.saveDataText(text);
            }
        };
    }
}
