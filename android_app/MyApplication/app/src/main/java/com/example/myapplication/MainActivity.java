package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView;
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);

        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
        imageView = (ImageView) findViewById(R.id.loginPic1);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic2);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic3);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic4);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic5);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic6);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic7);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic8);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic9);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic10);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic11);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic12);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic13);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic14);
        imageView.setColorFilter(filter);
        imageView = (ImageView) findViewById(R.id.loginPic15);
        imageView.setColorFilter(filter);


        final EditText exisitingUserName = (EditText) findViewById(R.id.exisitingUserName);
        final EditText exisitingPassword = (EditText) findViewById(R.id.exisitingUserPassword);
        TextView registerClick = (TextView) findViewById(R.id.registerLink);
        Button loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = exisitingUserName.getText().toString();
                String password = exisitingPassword.getText().toString();

                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);

                String userDetails = preferences.getString(user + password + "data", "Username or Password is incorrect");
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("display", userDetails);
                editor.commit();

                Intent dispayScreen = new Intent(MainActivity.this, Feed.class);
                startActivity(dispayScreen);
            }
        });

        registerClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrationScreen = new Intent(MainActivity.this, Register.class);
                startActivity(registrationScreen);
            }
        });
    }


}