package com.javatutorial.exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = sc.nextLine();

        System.out.print("Введите пароль: ");
        String password = sc.nextLine();

        System.out.print("Подтвердите пароль: ");
        String confirmPassword = sc.nextLine();

        try {
            Validator.validate(login, password, confirmPassword);
            System.out.println("Все завершилось успешно!");
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Что-то пошло не так...");
        }

    }
}
