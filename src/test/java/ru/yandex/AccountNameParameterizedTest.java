package ru.yandex;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AccountNameParameterizedTest {
    private final String name;
    private final boolean expected;

    public AccountNameParameterizedTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: name = {0} | expected = {1}")
    public static Object[] getName() {
        return new Object[][]{
                {null, false},
                {"", false},
                {" Пробел Вначале", false},
                {"Пробел Вконце ", false},
                {"Два  Пробела", false},
                {"Т2", false},
                {"Т 3", true},
                {"Т Т4", true},
                {"Тестики 18символов", true},
                {"Тестик на19символов", true},
                {"Тестище на20символов", false},
                {"Тест Тест11", true},
                {"12345678 123456789", true}
        };
    }

    @Test
    public void checkInputNameTest() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals("Invalid account name entered", actual, expected);

    }
}
