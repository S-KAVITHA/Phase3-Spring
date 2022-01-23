package web.junit.test.Test_Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
 
{
    
     @BeforeAll
    static void setup()    {
       System.out.println("@BeforeAll executed");
    }

    
     @BeforeEach
      void setupThis()    {
        System.out.println("@BeforeEach executed");
     }

     @Tag("DEV")
     @Test
    void testCalcOne()
    {
    	System.out.println("Test 1  executed");
    	Assertions.assertEquals(5,Calculator.add(2,3));
    }

     @Tag("PROD")
     @Disabled
     @Test
    void testCalcTwo()
    {
    	System.out.println("Test 2  executed");
    	Assertions.assertEquals(5,Calculator.add(2,3));
    	
    }

     @AfterEach
      void tearThis()    {
        System.out.println("@AfterEach executed");
     }

     @AfterAll
    static  void tearThis1()    {
        System.out.println("@AfterAll executed");
     }

   
}
