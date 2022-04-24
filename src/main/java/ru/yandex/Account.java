package ru.yandex;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    /* Метод проверки соответствия имени поставленным требованиям:
    name не является null
    (?=.{3,19}$) - длина строки 3-19 символов
    ^[a-zA-Z0-9А-Яа-я()]+ - начинается не с пробела
    \\s - в строке присутствует один пробел
    [a-zA-Z0-9А-Яа-я()]+$ - заканчивается не пробелом
     */
    public boolean checkNameToEmboss() {
        if (name == null) {
            return false;
        }
        return name.matches("(?=.{3,19}$)^[a-zA-Z0-9А-Яа-я()]+\\s[a-zA-Z0-9А-Яа-я()]+$");
    }
}