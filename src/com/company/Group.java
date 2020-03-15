package com.company;

public enum Group {
    WORK("Работа"),
    FRIENDS("Друзья"),
    FAMILY("Семья");

    private final String value;

    Group(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Group getGroup(String val) {
        for (Group value : Group.values()) {
            if (value.getValue().equals(val)) {
                return value;
            }
        }
        throw new IllegalArgumentException("No enum found with val: [" + val + "]");
    }
}
