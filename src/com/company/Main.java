package com.company;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contacts contacts = new Contacts(new HashMap<>());
        MissedCalls missedCalls = new MissedCalls(new TreeMap<>());
        String input = "";
        System.out.println("Программа: пропущенные вызовы.");
        menu();
        input = scanner.nextLine().replaceAll("\\p{P}", "");
        while (!input.equals("5")) {
            switch (input) {
                case "1":
                    System.out.println("Введите данные контакта, в формате:\n" +
                            "Имя, Фамилия, номер телефона, группа контакта('Работа';'Друзья';'Семья')");
                    input = scanner.nextLine();
                    String[] array = input.split(", ");
                    input = array[2].replaceAll("[\\p{P}\\s+]", "");
                    contacts.addContact(array[2], new Contact(array[0], array[1], array[2], Group.getGroup(array[3])));
                    break;
                case "2":
                    System.out.println("Добавьте номер пропущенного вызова");
                    input = scanner.nextLine().replaceAll("[\\p{P}\\s+]", "");
                    missedCalls.addMissedCall(LocalDateTime.now(), input);
                    break;
                case "3":
                    Map<String, Contact> mapContacts = contacts.getContacts();
                    missedCalls.printMissedCalls(mapContacts);
                    break;
                case "4":
                    missedCalls.clearMissedCalls();
                    break;
            }
            menu();
            input = scanner.nextLine().replaceAll("\\p{P}", "");
        }
    }

    private static void menu() {
        System.out.println("Меню:\n" +
                "1. Добавить контакт\n" +
                "2. Добавить пропущенный вызов\n" +
                "3. Вывести все пропущенные вызовы\n" +
                "4. Очистить пропущенные вызовы\n" +
                "5. Выход");
        System.out.println("Выберите пункт из меню (1-5):");
    }
}