package com.example;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    Cat cat;

    @Mock
    Feline feline;

    @Before
    public void initObjects() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundMethodTest() {


        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodMethodTest() throws Exception {

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }


}














