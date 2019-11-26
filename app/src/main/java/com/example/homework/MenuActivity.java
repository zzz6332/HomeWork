package com.example.homework;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("登陆");

        //*************点击菜单的登陆
        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MenuActivity.this, LogInActivity.class);
                startActivity(intent1);
            }
        });
        //**************点击菜单的腾讯
        Button button2 = (Button) findViewById(R.id.tencent);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "这是腾讯微博", Toast.LENGTH_SHORT).show();
            }
        });
        //***************点击菜单的新浪
        Button button3 = (Button) findViewById(R.id.xinlang);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "这是新浪微博", Toast.LENGTH_SHORT).show();
            }
        });
        //*****************点击菜单的注册
        Button button4 = (Button) findViewById(R.id.menu_resister);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenuActivity.this, RegisterActivity.class);
                startActivity(intent2);
            }
        });
    }
}
