package com.example.calender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class eventPage extends AppCompatActivity {

    public static final String msg = "com.example.calender.MainActivity";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_event_page);
        }
        public void addEvent2(View view){
            Intent intent = getIntent();
            String dt = intent.getStringExtra(MainActivity.date);

            EditText event = findViewById(R.id.event);
            String message = dt+"  --  "+event.getText().toString();

            Intent intent2 = new Intent(this,MainActivity.class);
            intent2.putExtra(msg,message);
            startActivity(intent2);

        }}
