package com.company;

import java.time.LocalDateTime;
        import java.time.format.DateTimeFormatter;
        import java.util.*;

public class MissedCalls {
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public MissedCalls(Map<LocalDateTime, String> missedCalls) {
        this.missedCalls = missedCalls;
    }

    public Map<LocalDateTime, String> getMissedCalls() {
        return missedCalls;
    }

    public void addMissedCall(LocalDateTime time, String phoneNumber) {
        missedCalls.put(time, phoneNumber);
        System.out.println("Добавлен.");
    }

    public void printMissedCalls(Map<String, Contact> mapContacts) {
        for (LocalDateTime value : missedCalls.keySet()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, hh:mm:ss");
            ;
            if (mapContacts.containsKey(missedCalls.get(value)) == true) {

                System.out.println(value.format(formatter) + ", " + missedCalls.get(value) + ", " + mapContacts.get(missedCalls.get(value)).getSurname() + ", " + mapContacts.get(missedCalls.get(value)).getName());
            } else {
                System.out.println(value.format(formatter) + " " + missedCalls.get(value));
            }
        }
    }

    public void clearMissedCalls() {
        missedCalls.clear();
        System.out.println("Журнал пропущенных вызовов очищен.");
    }
}