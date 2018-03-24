package com.example.pakut.firsttask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onEmptyScreenButtonClicked(View view) {
        Intent intent = new Intent(MainActivity.this, EmptyScreenActivity.class);
        startActivity(intent);
    }

    public void onToastButtonClicked(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Всплывающее сообщение!",
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();
    }
}
