package com.example.roberto.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by roberto on 07.10.2015.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("INFO2","B: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("INFO2","B: onStart"+Integer.toString(android.os.Process.myPid()));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("INFO2", "B: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("INFO2", "B: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("INFO2", "B: onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("INFO2", "B: onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("INFO2", "B: onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("INFO2", "B: onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("INFO2", "B: onSaveInstanceState");
    }



}


