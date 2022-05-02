import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;


public class skillDemoTester{

    @Test
    public void test1(){
        assertEquals(2, skillDemo.subtraction(4,2));
    }
}
 
 
//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar skillDemoTester.java

//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore skillDemoTester
//