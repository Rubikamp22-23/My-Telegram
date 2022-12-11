package com.example.myappbr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class get_phone_number_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_phone_number);
        Button button=findViewById(R.id.button_next);
        button.setOnClickListener(view -> startActivity(new Intent(get_phone_number_Activity.this,confirmation_number_Activity.class)));
    }
}