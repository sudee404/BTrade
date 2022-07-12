package com.example.btrade;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView txtnext;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnext=findViewById(R.id.next);
        txtnext.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this,HomeActivity.class);
            startActivity(intent);
        });

    }
}