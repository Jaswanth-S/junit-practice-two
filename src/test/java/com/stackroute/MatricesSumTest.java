package com.stackroute;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class MatricesSumTest {
    private static MatricesSum matricesSum;
    @BeforeClass
    public static void setUp()
    {
        matricesSum = new MatricesSum();
    }
    @AfterClass
    public static void tearDown()
    {
        matricesSum=null;
    }
    @SuppressWarnings("deprecation")
    @Test
    public void testMatricesSum()
    {
        assertEquals("MatricesSumTest, calculateMatricesSum() not does return correct values"
                ,new int[][]{{10,10},{10,10},{10,10}},
                matricesSum.calculateMatricesSum(3,2,new int[][]{{1,2},{3,4},{5,6}},
                        new int[][]{{9,8},{7,6},{5,4}}));
        assertEquals("MatricesSumTest, calculateMatricesSum() not does return correct values",
                new int[][]{{10,10,7},{10,10,6},{10,10,5}},
                matricesSum.calculateMatricesSum(3,3,new int[][]{{1,2,3},{3,4,3},{5,6,3}},
                        new int[][]{{9,8,4},{7,6,3},{5,4,2}}));
    }
    @Test
    public void testMatricesSumFailure()
    {
        assertNotNull("MatricesSumTestFailure, calculateMatricesSum() not does return correct values",
                matricesSum.calculateMatricesSum(3,2,new int[][]{{1,2},{3,4},{5,6}},
                        new int[][]{{9,8},{7,6},{5,4}}));
        assertNotEquals("MatricesSumTest, calculateMatricesSum() not does return correct values"
                ,new int[][]{{11,10},{14,16},{4,10}},
                matricesSum.calculateMatricesSum(3,2,new int[][]{{1,2},{3,4},{5,6}},
                        new int[][]{{9,8},{7,6},{5,4}}));
    }
}
