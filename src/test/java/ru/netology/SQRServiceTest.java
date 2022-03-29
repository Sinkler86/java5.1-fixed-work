package ru.netology;

import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public void shouldOccurrenceOfCount() {

        final int minRange = 200;
        final int maxRange = 300;

        SQRService counter = new SQRService();
        System.out.println("Количество квадратов: "
                + counter.occurrenceOfCount(minRange, maxRange));
    }
}
