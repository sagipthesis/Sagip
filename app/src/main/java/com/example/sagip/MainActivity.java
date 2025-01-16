package com.example.sagip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       EditText Email = findViewById(R.id.sign_in_email);
        EditText Password = findViewById(R.id.sign_in_Pass);
        Button btnSignIn = findViewById(R.id.sign_in_bnt);
        TextView tvSignUp = findViewById(R.id.register_btn);


        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Email.getText().toString();
                String password = Password.getText().toString();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Sign-In Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRegisterPage = new Intent(MainActivity.this, regiter_page.class);
                 startActivity(toRegisterPage);
                Toast.makeText(MainActivity.this, "Navigate to Sign-Up Screen", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
