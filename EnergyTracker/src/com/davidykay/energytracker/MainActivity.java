package com.davidykay.energytracker;

import android.app.Activity;
import android.os.Bundle;

import com.commonsware.android.syssvc.alarm.R;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}