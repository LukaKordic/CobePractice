package com.example.cobeosijek.myapplication.common.constants;

/**
 * Created by cobeosijek on 17/07/2017.
 */

public class Constants {

    public static final String EMAIL_ERROR = "Invalid email!";
    public static final String PASSWORD_ERROR = "Password has to be at least 6 characters long";
    public static final int MINIMUM_PASSWORD_LENGTH = 6;
    public static final String KEY_CAR = "CAR";
    public static final String KEY_EMAIL = "EMAIL";

    public static final int TYPE_POPULAR = 1;


    public static final String EMAIL_REGEX = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +  "\\@" + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" + "(" + "\\." + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" + ")+";
}
