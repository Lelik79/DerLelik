package com.company;

public class Contact {
    private String name;
    private String surname;
    private String phoneNumber;
    private Group group;

    public Contact(String name, String surname, String phoneNumber, Group group) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Контакт: " + name + " " + surname + " " + phoneNumber + " Группа: " + group;
    }
}