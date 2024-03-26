package com.javatutorial.exceptions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User {
    private final static Pattern PATTERN = Pattern.compile("\\w{1,20}");
    private final static String FORMAT = "Неверный формат ввода. " +
            "%s должен содержать только латинские буквы и/или цифры и иметь длину не более 20 символов.";
    private final String login;
    private String password;

    private User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static User create(String login, String password, String confirmPassword) {
        if (!isLoginValid(login)) {
            throw new WrongLoginException(String.format(FORMAT, "Логин"));
        }
        if (!isPasswordValid(password)) {
            throw new WrongPasswordException(String.format(FORMAT, "Пароль"));
        }
        if (!isPasswordConfirmed(password, confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }

        return new User(login, password);
    }

    private static boolean isLoginValid(String login) {
        return PATTERN.matcher(login).matches();
    }

    private static boolean isPasswordValid(String password) {
        return PATTERN.matcher(password).matches();
    }

    private static boolean isPasswordConfirmed(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }

    public void changePassword(String password) {
        if (!isPasswordValid(password)) {
            throw new WrongPasswordException(String.format(FORMAT, "Пароль"));
        }
        this.password = password;
    }

    @Override
    public String toString() {
        return "Логин: " + login +
                "\nПароль: " + password;
    }
}
