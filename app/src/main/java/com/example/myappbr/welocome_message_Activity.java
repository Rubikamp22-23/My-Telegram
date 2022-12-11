package com.example.myappbr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class welocome_message_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welocome_message);
        Button button= findViewById(R.id.button_start_messaging);
        button.setOnClickListener(view -> startActivity(new Intent(welocome_message_Activity.this,get_phone_number_Activity.class)));
    }
}