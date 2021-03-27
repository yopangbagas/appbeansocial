package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {

    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua2);

        txEmail = findViewById(R.id.textView3_IniHasilEmail);

        txPassword = findViewById(R.id.textView5_IniHasilPasword);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a" );

        String password = bundle.getString("b");

        txEmail.setText(email);

        txPassword.setText(password);


    }
}