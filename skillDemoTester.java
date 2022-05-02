import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;


public class skillDemoTester{

    @Test
    public void test1(){
        assertEquals(2, skillDemo.subtraction(2,2));
    }
}
