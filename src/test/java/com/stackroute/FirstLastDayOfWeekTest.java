package com.stackroute;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class FirstLastDayOfWeekTest {
    private static FirstLastDayOfWeek firstLastDayOfWeek;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        firstLastDayOfWeek= new FirstLastDayOfWeek();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        firstLastDayOfWeek= null;

    }
    @SuppressWarnings("deprecation")
    @Test
    public void testFirstLastDayOfWeek()
    {
        assertEquals("testFirstLastDayOfWeek(), printFLDayOfWeek does not return correct values",
                 new String[]{"Mon 25/03/2019","Sun 31/03/2019"},
                firstLastDayOfWeek.printFLDayOfWeek());

    }
    @Test
    public void testFirstLastDayOfWeekFailure()
    {
        assertNotNull("testFirstLastDayOfWeek(), printFLDayOfWeekdoes not return correct values",
                firstLastDayOfWeek.printFLDayOfWeek());
        assertNotEquals("testFirstLastDayOfWeek(), printFLDayOfWeekdoes not return correct values",
                new String[]{"Tue 25/03/2019","Sat 31/03/2019"},
                firstLastDayOfWeek.printFLDayOfWeek());
    }

}
