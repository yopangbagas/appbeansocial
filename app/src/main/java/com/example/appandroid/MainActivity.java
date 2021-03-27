package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.mnDaftar)
        {
            Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignin);
        edemail=findViewById(R.id.edEmail);
        edpassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                String email = "emailcontoh@mail.com";

                String pass = "123";

                if(edemail.getText().toString().equals("emailcontoh@mail.com")&& edpassword.getText().toString().equals("123")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Succeed", Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();

                    b.putString("a", nama.trim());

                    b.putString("b", password.trim());

                    Intent i = new Intent(getApplicationContext(), ActivityKedua.class);

                    i.putExtras(b);

                    startActivity(i);



                }
                else if(!edemail.getText().toString().equals("emailcontoh@mail.com")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email Yang Anda Masukkan Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else if(!edpassword.getText().toString().equals("123")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Password Yang Anda Masukkan Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Toast.makeText((getApplicationContext()),
                            "Email dan Password Anda Salah", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}