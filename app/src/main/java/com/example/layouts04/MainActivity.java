package com.example.layouts04;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button click1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click1 = findViewById(R.id.layout1);
    }

    public void demo1(View view) {
        startActivity(new Intent(getApplicationContext(), ViewsInCorners1.class));
    }

    public void demo2(View view) {
        startActivity(new Intent(getApplicationContext(), layout2.class));
    }

    public void demo3(View view) {
        startActivity(new Intent(getApplicationContext(), layout3.class));
    }

    public void demo4(View view) {
        startActivity(new Intent(getApplicationContext(), layout4.class));
    }
}
