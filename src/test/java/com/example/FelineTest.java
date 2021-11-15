package com.example;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline;

    @Before
    public void initObjects1() {
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyTest() {

        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() {

        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

}
