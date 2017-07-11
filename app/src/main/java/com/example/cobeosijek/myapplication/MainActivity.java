package com.example.cobeosijek.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etInputEmail, etInputPass;
    Button btnLogin;
    Intent intent;
    String passValidate, emailValidate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setUpUI();
        this.emailValidate = etInputEmail.getText().toString();
        this.passValidate = etInputPass.getText().toString();
        this.btnLogin.setOnClickListener(this);
    }

    private void setUpUI() {
        this.etInputEmail = (EditText) findViewById(R.id.et_input_email);
        this.etInputPass = (EditText) findViewById(R.id.et_input_pass);
        this.btnLogin = (Button) findViewById(R.id.btn_login);
    }

    @Override
    public void onClick(View view) {

        String pattern = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +

                "\\@" +

                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +

                "(" +

                "\\." +

                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +

                ")+";


        String email = etInputEmail.getText().toString();

        Matcher matcher = Pattern.compile(pattern).matcher(email);


        if (!(matcher.matches())) {
            etInputEmail.setError("Invalid email");
            etInputEmail.requestFocus();

        } else if (etInputPass.length() < 6) {
            etInputPass.setError("Password has to be at least 6 chars long");
            etInputPass.requestFocus();
        } else {
            intent = new Intent(getApplicationContext(), CarList.class);
            startActivity(intent);
        }
    }
}
