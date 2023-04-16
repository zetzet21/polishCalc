package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    String strPlus = "23+";
    String strPlusExtra = "002++";
    String strMinus = "23-";
    String strMinusExtra = "21-";
    String strMult = "23*";
    String strMultExtra = "03*";
    String strDiv = "36/";
    String strDivExtra = "63/";
    @Test
    //Тестирование операции "+"
    void calcPlus() {
        Calculation example = new Calculation();

        double actual = example.calc(strPlus);
        double expected = 5.0;
        assertEquals(actual,expected);
    }

    @Test
        //Тестирование операции "-"
    void calcMinus() {
        Calculation example = new Calculation();

        double actual = example.calc(strMinus);
        double expected = 1.0;
        assertEquals(actual,expected);
    }
    @Test
        //Тестирование операции "*"
    void calcMult() {
        Calculation example = new Calculation();

        double actual = example.calc(strMult);
        double expected = 6.0;
        assertEquals(actual,expected);
    }
    @Test
        //Тестирование операции "/"
    void calcDiv() {
        Calculation example = new Calculation();

        double actual = example.calc(strDiv);
        double expected = 2.0;
        assertEquals(actual,expected);
    }
    @Test
        //Тестирование операции "+"
    void calcPlusExtra() {
        Calculation example = new Calculation();

        double actual = example.calc(strPlusExtra);
        double expected = 2.0;
        assertEquals(actual,expected);
    }

    @Test
        //Тестирование операции "-"
    void calcMinusExtra() {
        Calculation example = new Calculation();

        double actual = example.calc(strMinusExtra);
        double expected = -1.0;
        assertEquals(actual,expected);
    }
    @Test
        //Тестирование операции "*"
    void calcMultExtra() {
        Calculation example = new Calculation();

        double actual = example.calc(strMultExtra);
        double expected = 0.0;
        assertEquals(actual,expected);
    }
    @Test
        //Тестирование операции "/"
    void calcDivExtra() {
        Calculation example = new Calculation();

        double actual = example.calc(strDivExtra);
        double expected = 0.5;
        assertEquals(actual,expected);
    }
}