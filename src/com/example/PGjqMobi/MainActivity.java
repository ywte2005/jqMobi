package com.example.PGjqMobi;

import android.os.Bundle;

import org.apache.cordova.*;

import com.example.PGjqMobi.R;

public class MainActivity extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("splashscreen", R.drawable.splash);
        super.loadUrl(Config.getStartUrl(),5000);
    }
}