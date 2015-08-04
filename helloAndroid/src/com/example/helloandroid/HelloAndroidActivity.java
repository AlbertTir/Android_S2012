package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this); //only works with "this" inside the variable, not sure why
        									//creates a label type property on the screen to put text on
        tv.setText("Hello world, Helloworldapp!");
        setContentView(tv);
    }
}