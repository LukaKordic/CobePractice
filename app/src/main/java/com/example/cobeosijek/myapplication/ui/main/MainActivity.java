package com.example.cobeosijek.myapplication.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.cobeosijek.myapplication.R;
import com.example.cobeosijek.myapplication.common.constants.Constants;
import com.example.cobeosijek.myapplication.ui.feed.CarListActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MainView {

    private EditText emailInput;
    private EditText passwordInput;
    private Button loginButton;

    private MainPresenter presenter = new MainPresenterImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.setView(this);
        setUpUI();
        loginButton.setOnClickListener(this);
    }

    private void setUpUI() {
        emailInput = (EditText) findViewById(R.id.et_input_email);
        passwordInput = (EditText) findViewById(R.id.et_input_pass);
        loginButton = (Button) findViewById(R.id.btn_login);
    }

    @Override
    public void onClick(View view) {
        presenter.checkUserCredentials(emailInput.getText().toString(), passwordInput.getText().toString());
    }

    @Override
    public void showEmailError() {
        emailInput.setError(Constants.EMAIL_ERROR);
        emailInput.requestFocus();
    }

    @Override
    public void showPasswordError() {
        passwordInput.setError(Constants.PASSWORD_ERROR);
        passwordInput.requestFocus();
    }

    @Override
    public void startFeed(String email) {
        Intent intent = new Intent(getApplicationContext(), CarListActivity.class);
        intent.putExtra(Constants.KEY_EMAIL, email);
        startActivity(intent);
    }
}
