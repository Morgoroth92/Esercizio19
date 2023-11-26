package org.example;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.parse("2023-03-01T13:00:00Z");

        zdt = zdt.plusYears(1);
        zdt = zdt.minusMonths(1);
        zdt = zdt.plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss", Locale.ITALY);
        String output = zdt.format(formatter);
        System.out.println(output);
    }
}