package com.example.homeworkemusic;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    private TextView tVOnSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tVOnSecondActivity = findViewById(R.id.tv_putExtra);
        String text = getIntent().getStringExtra("key");
        tVOnSecondActivity.setText(text);
    }
}