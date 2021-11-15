package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void LionHaveManeIfHeMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expected = true;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void LionHaventManeIfSheFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expected = false;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }


    @Test(expected = java.lang.Exception.class)
    public void ThirdBranchExceptionTest() throws Exception {

        Lion lion1 = new Lion("Оно", feline);
        lion1.doesHaveMane();
    }

    @Test
    public void getKittensMethodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expected = 0;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodMethodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }
}
