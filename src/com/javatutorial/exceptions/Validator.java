package com.javatutorial.exceptions;

import java.util.regex.Pattern;

public class Validator {
    private Validator() {

    }

    public static void validate(String login, String password, String confirmPassword) {
        Pattern pattern = Pattern.compile("\\w{1,20}");
        String format = "Неверный формат ввода. " +
                "%s должен содержать только латинские буквы и/или цифры и иметь длину не более 20 символов.";
        if (!matchesValueByPattern(login, pattern)) {
            throw new WrongLoginException(String.format(format, "Логин"));
        }
        if (!matchesValueByPattern(password, pattern)) {
            throw new WrongPasswordException(String.format(format, "Пароль"));
        }
        if (!isPasswordConfirmed(password, confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }
    }

    private static boolean matchesValueByPattern(String value, Pattern pattern) {
        return pattern.matcher(value).matches();
    }

    private static boolean isPasswordConfirmed(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }
}
