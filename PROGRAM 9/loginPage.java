package com.example.a10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginPage extends AppCompatActivity {
EditText emailEditText,passwordEditText;
Button loginBtn;
int counter = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        emailEditText = findViewById(R.id.EmailId);
        passwordEditText = findViewById(R.id.Password);
        loginBtn = findViewById(R.id.button2);
        String registeredEmail = getIntent().getStringExtra("email");
        String registeredPassword = getIntent().getStringExtra("password");
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                if(registeredEmail.equals(email)&&registeredPassword.equals(password)){
                    Intent intent = new Intent(loginPage.this,LoginSuccess.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(loginPage.this,"Invalid Credentials",Toast.LENGTH_LONG).show();
                }
                counter--;
                if(counter==0){
                    Toast.makeText(loginPage.this,"Failed login attempts",Toast.LENGTH_LONG).show();
                    loginBtn.setEnabled(false);
                }
            }
        });
    }
}
