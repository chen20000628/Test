package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.ev_userName);
        password = findViewById(R.id.ev_password);
        login = findViewById(R.id.btn_login);
        exit = findViewById(R.id.btn_exit);

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username = ((EditText) findViewById(R.id.ev_userName)).getText().toString();
                    String password = ((EditText) findViewById(R.id.ev_password)).getText().toString();
                    if(username.equals("Bruce")&& password.equals("111")){
                        Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this,StudentActivity.class);
                        intent.putExtra("chen",username);
                        startActivity(intent);

                    }else{
                        Toast.makeText(MainActivity.this,"账号或密码错误，请重新输入",Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
    }
