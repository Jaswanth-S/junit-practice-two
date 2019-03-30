package com.stackroute;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class VowelEliminateTest {
    private static VowelEliminate vowelEliminate;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        vowelEliminate = new VowelEliminate();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        vowelEliminate= null;

    }
    @SuppressWarnings("deprecation")
    @Test
    public void testVowelEliminate()
    {
        assertEquals("testVowelEliminate(), checkVowelEliminate does not return correct values",
                new String[]{"nd","Grmny","Jpn","ntd Stts"},
                vowelEliminate.checkVowelEliminate(new String[]{"India","Germany","Japan","United States"}));
        assertEquals("testVowelEliminate(), checkVowelEliminate does not return correct values",
                new String[]{"Jswnth","S","Bl","Hrsh","Rht"},
                vowelEliminate.checkVowelEliminate(new String[]{"Jaswanth","Sai","Balu","Harsha","Rohit"}));
    }
    @Test
    public void testVowelEliminateFailure()
    {
        assertNotNull("testVowelEliminate(), checkVowelEliminate does not return correct values",
                vowelEliminate.checkVowelEliminate(new String[]{"India"}));
        assertNotEquals("testVowelEliminate(), checkVowelEliminate does not return correct values",
                new String[]{"India","Germny","Japan","United States"},
                vowelEliminate.checkVowelEliminate(new String[]{"India","Germany","Japan","United States"}));

    }

}
