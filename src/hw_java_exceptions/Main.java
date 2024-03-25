package hw_java_exceptions;

import java.util.Scanner;

public class Main {

    public static void checkLoginAndPassword(String login, String password, String confirmPassword) {
        String regex = "\\w{1,20}";
        if (!login.matches(regex)) {
            throw new WrongLoginException("Неверный формат ввода. Логин должен содержать только латинские буквы и/или цифры и иметь длину не более 20 символов.");
        }

        if (!password.matches(regex)) {
            throw new WrongPasswordException("Неверный формат ввода. Пароль должен содержать только латинские буквы и/или цифры и иметь длину не более 20 символов.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = sc.nextLine();

        System.out.print("Введите пароль: ");
        String password = sc.nextLine();

        System.out.print("Подтвердите пароль: ");
        String confirmPassword = sc.nextLine();

        try {
            checkLoginAndPassword(login, password, confirmPassword);
            System.out.println("Все завершилось успешно!");
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так...");
        }


    }
}
