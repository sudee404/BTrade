package com.example.btrade;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button logbtn,signup;
    EditText edt_user,edt_pass;
    TextView textView;
    ProgressDialog progressDialog;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        logbtn = findViewById(R.id.loginbtn);
        signup= findViewById(R.id.noacc);
        edt_user = findViewById(R.id.username);
        edt_pass = findViewById(R.id.pass);
        textView=findViewById(R.id.text_dont);
        /*textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });*/
        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=edt_user.getText().toString();
                String password=edt_pass.getText().toString();
                if (username.isEmpty() && password.isEmpty()) {
                    Toast.makeText(LoginActivity.this,
                            "Please enter all credentials",
                            Toast.LENGTH_SHORT).show();
                }else if (username.isEmpty()) {
                    Toast.makeText(LoginActivity.this,
                            "Please enter email",
                            Toast.LENGTH_SHORT).show();
                }
                else if (password.isEmpty()) {
                    Toast.makeText(LoginActivity.this,
                            "Please enter PASSWORD",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Intent sign=new Intent(LoginActivity.this,DashboardActivity.class);
                    startActivity(sign);
                }
            }

        });
    }
}