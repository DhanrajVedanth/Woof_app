package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        final EditText newUserFirstName = (EditText) findViewById(R.id.newUserFirstName);
        final EditText newUserLastName = (EditText) findViewById(R.id.newUserLastName);
        final EditText newUserEmail = (EditText) findViewById(R.id.newUserEmail);
        final EditText newUserPassword = (EditText) findViewById(R.id.newUserPassword);
        final EditText newUserUserName = (EditText) findViewById(R.id.newUserUserName);
        Button newUserRegisterButton = (Button) findViewById(R.id.newUserRegisterButton);

        newUserRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                String newUserFN = newUserFirstName.getText().toString();
                String newUserLN = newUserLastName.getText().toString();
                String newUserPW = newUserPassword.getText().toString();
                String newUserEM = newUserEmail.getText().toString();
                String newUserUN = newUserUserName.getText().toString();


                SharedPreferences.Editor editor = preferences.edit();

                editor.putString(newUserUN + newUserPW + "data", newUserUN + "\n" + newUserEM);
                editor.commit();

                Intent loginScreen = new Intent(Register.this, Feed.class);
                startActivity(loginScreen);
            }
        });
    }
}