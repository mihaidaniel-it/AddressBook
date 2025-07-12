package ru.skillbox.services;

public class MenuNavigator {
    //    Методы
    public void showMenu() {
        System.out.println("            ");
        System.out.println("Адресная кнгиа");
        System.out.println("1 - новый контакт");
        System.out.println("2 - удаление существующего контакта");
        System.out.println("3 - вывод всех контактов");
        System.out.println("4 - завершение работы");
        System.out.print("Введите нужную опцию и нажмите Enter [1..4]: ");
    }

    public void optionCheck(int selectedOption, AddressBook addressBook) {
        if (selectedOption == 1) {
            addressBook.addUser();
        } else if (selectedOption == 2) {
            addressBook.deleteUser();
        } else if (selectedOption == 3) {
            addressBook.showAllUsers();
        } else if (selectedOption == 4) {
            System.out.println("Работа программы завершена, ждём вас снова!");
            System.exit(0);
        }
    }
}
