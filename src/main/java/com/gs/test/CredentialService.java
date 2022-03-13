package com.gs.test;

import java.util.Random;

public class CredentialService {

    public static String getPasswordString() {
        String PASSWORDCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890$#@!";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) {
            int index = (int) (rnd.nextFloat() * PASSWORDCHARS.length());
            salt.append(PASSWORDCHARS.charAt(index));
        }
        String password = salt.toString();
        return password;
    }
}
