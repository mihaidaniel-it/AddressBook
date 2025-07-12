package ru.skillbox.model;

public class Contact {
    //    Поля
    private int id;
    private String username;
    private String userJobTitle;
    private String userBirthday;
    private String userPhoneNumber;
    private String userEmail;

    //    Конструктор
    public void setUserInfo(int id, String username, String userJobTitle, String userBirthday, String userPhoneNumber, String userEmail) {
        this.id = id;
        this.username = username;
        this.userJobTitle = userJobTitle;
        this.userBirthday = userBirthday;
        this.userPhoneNumber = userPhoneNumber;
        this.userEmail = userEmail;
    }

    //        Геттеры
    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getUserJobTitle() {
        return this.userJobTitle;
    }

    public String getUserBirthday() {
        return this.userBirthday;
    }

    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    //    Сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserJobTitle(String userJobTitle) {
        this.userJobTitle = userJobTitle;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
