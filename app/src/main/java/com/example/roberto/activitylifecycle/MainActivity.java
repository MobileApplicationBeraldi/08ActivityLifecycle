package com.example.roberto.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private  class Bomber extends Thread{
        public Bomber() {
        }
        public void run(){

            int i=1;
            while (i%2!=0){
                Log.i("INFO2",""+i);
                for (int j=0;j<1000000000;j++);
                i=i+2;
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Thread(new Bomber()).start();


        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        Log.i("INFO2", "A: onCreate");
        }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("INFO2","A: onStart"+this.toString());
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("INFO2", "A: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("INFO2", "A: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("INFO2", "A: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("INFO2", "A: onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("INFO2", "A: onRestart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("INFO2", "A: onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putCharSequence("Test","prova");
        Log.i("INFO2", "A: onSaveInstanceState");
    }
}

