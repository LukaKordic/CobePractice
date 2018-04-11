package com.example.cobeosijek.myapplication.ui.main;

/**
 * Created by cobeosijek on 17/07/2017.
 */

public interface MainPresenter {

    void setView(MainView mainView);

    void checkUserCredentials(String email, String password);
}
