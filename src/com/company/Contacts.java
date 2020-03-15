package com.company;

import java.util.*;

public class Contacts {
    private Map<String, Contact> contacts = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    String input = "";


    public Contacts(Map<String, Contact> contacts) {
        this.contacts = contacts;
    }

    public Map<String, Contact> getContacts() {
        return contacts;
    }

    public void addContact(String key, Contact contact) {
        if (contacts.containsKey(key) == false) {
            contacts.put(key, contact);
            System.out.println("Контакт добавлен.");
        } else {
            System.out.println("Контакт с таким номером уже существует!\nЕсли хотите заменить его, введите 'Да'");
            input = scanner.nextLine();
            if (input.equals("Да")) {
                contacts.put(key, contact);
            }
        }
    }

    public void removeContact(String name, String surname) {
        for (String key : contacts.keySet()) {
            if (contacts.get(key).getSurname().equals(surname) && contacts.get(key).getName().equals(name)) {
                contacts.remove(key);
            } else {
                System.out.println("Контакт в базе не найден!");
            }
        }
    }

    public Contact findContact(String phoneNumber) {
        Contact contact = contacts.get(phoneNumber);
        return contact;
    }
}