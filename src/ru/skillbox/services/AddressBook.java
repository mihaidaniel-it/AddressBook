package ru.skillbox.services;

import java.util.Scanner;

import ru.skillbox.model.Contact;

public class AddressBook {
    //    Объект
    Scanner scanner = new Scanner(System.in);
    Contact contact = new Contact();
    MenuNavigator menuNavigator = new MenuNavigator();

    //    Поля
    private Contact[] contacts = new Contact[50];
    private int existUsers = 0;

    //    Методы
    public void addUser() {
        System.out.println("            ");
        System.out.println("Вы выбрали опцию 'Создать новый контакт'");
        System.out.print("Введите Ф.И.О контакта: ");
        String username = scanner.nextLine();

        System.out.print("Должность: ");
        String userJobTitle = scanner.nextLine();

        System.out.print("Дата рождения: ");
        String userBirthday = scanner.nextLine();

        System.out.print("Номер телефона: ");
        String userPhoneNumber = scanner.nextLine();

        System.out.print("Адрес электной почты: ");
        String userEmail = scanner.nextLine();

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                String existUsername = contacts[i].getUsername().toLowerCase().replaceAll("\\s+", "");
                String inputUsername = username.toLowerCase().replaceAll("\\s+", "");

                if (existUsername.equals(inputUsername)) {
                    System.out.println("Пользователь " + username + " уже присутствует в списке\n" + "контактов, он будет обновлён в соответствии с новыми данными.");

//                Обновляем данные пользователя
                    Contact updateContact = new Contact();
                    updateContact.setUserInfo(contacts[i].getId(), username, userJobTitle, userBirthday, userPhoneNumber, userEmail);
                    contacts[i] = updateContact;

                    System.out.println("Контакт был обновлён");
                    return;
                }
            }
        }

        // Поиск первой свободной ячейки
        int freeIndex = -1;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                freeIndex = i;
                break;
            }
        }

        if (freeIndex == -1) {
            System.out.println("Адресная книга заполнена. Невозможно добавить новый контакт.");
            return;
        }

//        Добавление нового пользователя
        Contact newContact = new Contact();
        newContact.setUserInfo(existUsers, username, userJobTitle, userBirthday, userPhoneNumber, userEmail);
        contacts[freeIndex] = newContact;
        existUsers++;
        System.out.println("Новый контакт добавлен");
    }

    public void showAllUsers() {
        if (contacts == null || contacts.length == 0 || existUsers == 0) {
            System.out.println("Ваша адресная книга пустая. Добавьте новые контакты");
        }

        if (existUsers > 0) {
            for (int i = 0; i < existUsers; i++) {
                System.out.println("---------------------------");
                System.out.println("ID: " + contacts[i].getId());
                System.out.println("Ф.И.О.: " + contacts[i].getUsername());
                System.out.println("Должность: " + contacts[i].getUserJobTitle());
                System.out.println("Дата рождения: " + contacts[i].getUserBirthday());
                System.out.println("Номер телефона: " + contacts[i].getUserPhoneNumber());
                System.out.println("Адрес электронной почты: " + contacts[i].getUserEmail());
            }
        }
    }

    public void deleteUser() {
        System.out.println();
        System.out.println("Удаление существующего контакта");
        System.out.print("Введите ID контакта: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        int removeIndex = -1;

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getId() == id) {
                removeIndex = i;
                break;
            }
        }

        if (removeIndex == -1) {
            System.out.println("Пользователь с ID: " + id + " не найден");
            return;
        }

        contacts[removeIndex] = null;
        existUsers--;
        System.out.println("Контакт с ID: " + id + " удалён");
    }
}