package com.example.jerseysquares;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

/*    private Button registerBTN;
    private TextView backtoLogin;
    private EditText editPassword, editUserName, editAddress, editCity,
                     editZipcode, editEMail, editState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backtoLogin = (TextView)findViewById(R.id.Backtologin);
        registerBTN = (Button) findViewById(R.id.createReg);
        editUserName = (EditText)findViewById(R.id.editUserName);
        editPassword = (EditText)findViewById(R.id.editPassword);
        registerBTN.setOnClickListener(this);
        backtoLogin.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.createReg:
                getSharedPreferences("jerseysquarePreferences", Context.MODE_PRIVATE).edit()
                        .putString("password",editPassword.getText().toString()).commit();
                getSharedPreferences("jerseysquarePreferences", Context.MODE_PRIVATE).edit()
                        .putString("username",editUserName.getText().toString()).commit();
                getSharedPreferences("jerseysquarePreferences", Context.MODE_PRIVATE).edit()
                        .putString("password",editAddress.getText().toString()).commit();
                getSharedPreferences("jerseysquarePreferences", Context.MODE_PRIVATE).edit()
                        .putString("username",editZipcode.getText().toString()).commit();
                getSharedPreferences("jerseysquarePreferences", Context.MODE_PRIVATE).edit()
                        .putString("password",editEMail.getText().toString()).commit();
                getSharedPreferences("jerseysquarePreferences", Context.MODE_PRIVATE).edit()
                        .putString("username",editState.getText().toString()).commit();
                getSharedPreferences("jerseysquarePreferences", Context.MODE_PRIVATE).edit()
                        .putString("password",editCity.getText().toString()).commit();

                break;
            case R.id.Backtologin:

                break;
            default:
        }
    }*/




} //public class RegisterActivity
