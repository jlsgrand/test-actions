package fr.jgrand;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void sum() {
        Calculate c = new Calculate();

        Assertions.assertEquals(3, c.sum(1, 2));
    }

}