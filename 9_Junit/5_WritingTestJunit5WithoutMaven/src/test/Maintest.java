package test;

import org.junit.jupiter.api.Test;

import static com.jitu.Main.ReverseString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Maintest {

    @Test
    void TestReverseString(){

        String ActualResult=ReverseString("java");

        assertEquals("avaj",ActualResult);

    }
}
