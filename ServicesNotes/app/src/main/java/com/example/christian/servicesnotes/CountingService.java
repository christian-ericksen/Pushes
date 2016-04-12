package com.example.christian.servicesnotes;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Christian on 3/2/16.
 */
public class CountingService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                countFromMinToMax();
            }
        };

        new Thread(runnable).start();

        Toast.makeText(CountingService.this, "Starting to count", Toast.LENGTH_SHORT).show();
        countFromMinToMax();
        Toast.makeText(CountingService.this, "Bleh", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void countFromMinToMax(){
        int number = Integer.MIN_VALUE;
        Log.d("COUNTING SERVICE", "Started counting");

        while (number < Integer.MAX_VALUE){
            number++;
        }

        }
    }

