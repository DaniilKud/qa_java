package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class FelineKittensCountParamTest {

    private final int actual;
    private final int expected;

    public FelineKittensCountParamTest(int actual, int expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {2, 2},
                {1, 1},
                {0, 0},
        };
    }

    @Test
    public void testGetKittensWithArgument() {
        Feline feline = new Feline();
        int actualCount = feline.getKittens(actual);
        Assert.assertEquals(expected, actualCount);
    }

}
