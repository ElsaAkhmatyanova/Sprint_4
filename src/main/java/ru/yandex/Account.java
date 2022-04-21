package ru.yandex;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name == null) return false;
        if (name.length() < 3 | name.length() > 19) return false;
        if (name.startsWith(" ") | name.endsWith(" ")) return false;
        int spaceCount = 0;
        for (char ch : name.toCharArray()) {
            if (ch == ' ') spaceCount++;
        }
        return spaceCount == 1;
    }

}