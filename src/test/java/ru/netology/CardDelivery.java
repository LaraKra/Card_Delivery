package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CardDelivery {

    @BeforeEach
    public void setUp() {
        open("http://localhost:9999");
    }

    @Test
    public void shouldSendForm() {
        String localD = LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        $(".input__control[type='text'][placeholder='Город']").setValue("Калининград");
    }
}
