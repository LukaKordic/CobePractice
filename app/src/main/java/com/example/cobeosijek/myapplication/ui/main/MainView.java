package com.example.cobeosijek.myapplication.ui.main;

import android.os.Bundle;

/**
 * Created by cobeosijek on 17/07/2017.
 */

public interface MainView {

    void onCreate(Bundle savedInstanceState);

    void showEmailError();

    void showPasswordError();

    void startFeed(String email);
}
