package com.example.myappbr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class confirmation_number_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_number);
        Button button=findViewById(R.id.finish_button);
        button.setOnClickListener(view -> startActivity(new Intent(confirmation_number_Activity.this,my_profile_Activity.class)));
    }
}