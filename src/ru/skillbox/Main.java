package ru.skillbox;

import java.util.Scanner;

import ru.skillbox.services.AddressBook;
import ru.skillbox.services.MenuNavigator;

public class Main {
    public static void main(String[] args) {
//        Создание объекта
        MenuNavigator menuNavigator = new MenuNavigator();
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

//        Ввод опции
        int selectedOption = 0;
        while (true) {
            menuNavigator.showMenu();

            if (scanner.hasNextInt()) {
                selectedOption = scanner.nextInt();
                scanner.nextLine();
                if (selectedOption >= 1 && selectedOption <= 4) {
                    menuNavigator.optionCheck(selectedOption, addressBook);
                } else {
                    System.out.println("Выбрана неверная опция! Попробуйте заново.");
                    System.out.println("            ");
                }
            } else {
                System.out.println("Выбрана неверная опция! Попробуйте заново.");
                System.out.println("            ");
                scanner.next();
            }
        }
    }
}