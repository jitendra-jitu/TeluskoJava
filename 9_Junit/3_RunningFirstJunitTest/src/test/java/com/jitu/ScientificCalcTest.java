package com.jitu;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScientificCalcTest {

    @Test
    public void test() {

        ScientificCalc scientificCalc=new ScientificCalc();
        int ActualResult=scientificCalc.sqrt(2);
        int ExpectedResult=4;
        assertEquals(ExpectedResult,ActualResult);

//        System.out.println("testing sqrt");
    }
}