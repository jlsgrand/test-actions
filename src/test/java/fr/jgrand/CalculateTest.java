package fr.jgrand;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculateTest {

    @Test
    void sum() {
        Calculate c = new Calculate();

        Assertions.assertEquals(3, c.sum(1, 2));
    }

    @Test
    void sum2() {
        Calculate c = new Calculate();

        Assertions.assertEquals(5, c.sum(3, 2));
    }

    @Test
    void sumOk() {
        Calculate c = new Calculate();

        Assertions.assertEquals(7, c.sum(3, 4));
    }

}