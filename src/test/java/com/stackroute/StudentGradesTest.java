package com.stackroute;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class StudentGradesTest {
    private static StudentGrades studentGrades;
    @BeforeClass
    public static void  setUp()
    {
        studentGrades = new StudentGrades();
    }
    @AfterClass
    public static void tearDown()
    {
        studentGrades = null;
    }
    @SuppressWarnings("deprecation")
    @Test
    public void testStudentGrades()
    {
        assertEquals("StudentGradesTest, checkStudentGrades() not does return correct values",
                "all grades are between 0 to 100",
                studentGrades.checkStudentGrades(new int[]{54,76,99,24,54,95}));
        assertEquals("StudentGradesTest, checkStudentGrades() not does return correct values",
                "all grades are between 0 to 100",
                studentGrades.checkStudentGrades(new int[]{74,23,100,1,52,98}));
        assertEquals("StudentGradesTest, checkStudentGrades() not does return correct values",
                "all grades are between 0 to 100",
                studentGrades.checkStudentGrades(new int[]{94,86,92,74,95,91}));
    }
    @Test
    public void testStudentsGradesFailure()
    {
        assertNotNull("StudentGradesTestFailure, checkStudentGrades() not does return correct values",
                studentGrades.checkStudentGrades(new int[]{54,76,99,24,54,95}));
        assertNotEquals("StudentGradesTestFailure, checkStudentGrades() not does return correct values",
                "grades out of range",
                studentGrades.checkStudentGrades(new int[]{54,76,102,24,54,95}));
    }
}
