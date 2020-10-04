package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void answer() {
        assertThat(DummyBot.answer("Привет, Бот."), is("Привет, умник.")
        );
    }
    @Test
    public void answer2() {
        assertThat(DummyBot.answer("Пока."), is("До скорой встречи.")
        );
    }

    @Test
    public void answer3() {
        assertThat(DummyBot.answer("Сколько будет 2 + 2?"), is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}