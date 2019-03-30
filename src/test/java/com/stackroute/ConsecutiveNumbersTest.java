package com.stackroute;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class ConsecutiveNumbersTest {
    private static ConsecutiveNumbers consecutiveNumbers;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        consecutiveNumbers = new ConsecutiveNumbers();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        consecutiveNumbers= null;

    }
    @SuppressWarnings("deprecation")
    @Test
    public void testConsecutiveNumbersTest()
    {
        assertEquals("testConsecutiveNumbersTest(),checkConsecutiveNumbers does not return correct values",
                "consecutive numbers",
                consecutiveNumbers.checkConsecutiveNumbers("97,96,97,96,95,94,93"));
        assertEquals("testConsecutiveNumbersTest(),checkConsecutiveNumbers does not return correct values",
                "consecutive numbers",
                consecutiveNumbers.checkConsecutiveNumbers("5,4,3,4,5,6,7"));
        assertEquals("testConsecutiveNumbersTest(),checkConsecutiveNumbers does not return correct values",
                "not consecutive numbers",
                consecutiveNumbers.checkConsecutiveNumbers("6,5,4,3,4,6,7"));
    }
    @Test
    public void testConsecutiveNumbersTestFailure()
    {
        assertNotNull("testConsecutiveNumbersTestFailure(), checkConsecutiveNumbers does not return correct values",
                consecutiveNumbers.checkConsecutiveNumbers("5,4,3,4,5,6,7"));
        assertNotEquals("testConsecutiveNumbersTestFailure(), checkConsecutiveNumbers does not return correct values",
                "consecutive numbers",
                consecutiveNumbers.checkConsecutiveNumbers("5,4,3,2,5,6,8"  ));

    }

}
