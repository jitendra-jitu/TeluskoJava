package com.jitu.test;

import com.jitu.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest{

    @Test
    public void TestReverseString(){

        Main main=new Main();
        String ActualResult=main.ReverseString("jitu");

        assertEquals("utij",ActualResult);

    }
}