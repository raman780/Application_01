package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //    v(String, String)(verbose)
    //    d(String, String)(debug)
    //    i(String, String)(information)
    //    w(String, String)(warning)
    //    e(String, String)(error)

//    log.d(tag, message)



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adding log statements in onCreate method :

        Log.v("Verbose", "onCreate: This is for checking Verbose message");
        Log.d("Debug", "onCreate: This is for checking debug message");
        Log.i("information", "onCreate: This is for checking information message");
        Log.w("warning", "onCreate: This is for checking warning message");
        Log.e("error", "onCreate: This is for checking error message");


    }
}