package com.example.myappbr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class my_profile_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        ImageView imageView=findViewById(R.id.back_button);
        imageView.setOnClickListener(view -> startActivity(new Intent(my_profile_Activity.this,confirmation_number_Activity.class)));
    }
}