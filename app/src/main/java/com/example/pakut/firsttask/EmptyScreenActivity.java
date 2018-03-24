package com.example.pakut.firsttask;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by pakut on 24.03.2018.
 */

public class EmptyScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_empty_screen);
        ImageView imageView = findViewById(R.id.helloImage);
        imageView.setImageResource(R.drawable.hello);
    }
}
