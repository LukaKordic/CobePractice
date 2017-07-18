package com.example.cobeosijek.myapplication.ui.main;

import java.util.regex.Pattern;

import static com.example.cobeosijek.myapplication.common.constants.Constants.EMAIL_REGEX;
import static com.example.cobeosijek.myapplication.common.constants.Constants.MINIMUM_PASSWORD_LENGTH;

/**
 * Created by cobeosijek on 17/07/2017.
 */

public class MainPresenterImpl implements MainPresenter {

    private MainView mainView;

    @Override
    public void setView(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void checkUserCredentials(String email, String password) {
        if (!(Pattern.matches(EMAIL_REGEX, email))) {
            mainView.showEmailError();
        } else if (password.length() < MINIMUM_PASSWORD_LENGTH) {
            mainView.showPasswordError();
        } else {
            mainView.startFeed(email);
        }
    }
}
