package by.epam.arrayTask.action;

import by.epam.arrayTask.entity.CustomArray;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayComputationTest extends TestCase {
    CustomArray customArray;
    ArrayComputation arrayComputation;

    @BeforeClass
    public void setUp()
    {
        customArray = new CustomArray();
        arrayComputation = new ArrayComputation();
    }

    @AfterClass
    public void tearDown()
    {
        customArray = null;
        arrayComputation = null;
    }

    @Test
    public void testAverage(int[] array, int expected)
    {
        customArray.setArray(array);
        int actual = arrayComputation.average(customArray);
        assertEquals(actual, expected, 0.001);
    }

    @Test
    public void testSum(int[] array, int expected)
    {
        customArray.setArray(array);
        int actual = arrayComputation.sum(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testNegativeElementsCount(int[] array, int expected)
    {
        customArray.setArray(array);
        int actual = arrayComputation.negativeElementsCount(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testPositiveElementsCount(int[] array, int expected)
    {
        customArray.setArray(array);
        int actual = arrayComputation.positiveElementsCount(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testReplaceElement()
    {
        customArray = new CustomArray(15, 2, 0, -7, 9, 3);
        int[] expected = {0, 2, 0, -7, 0, 3};
        arrayComputation.replaceElement(customArray);
        assertEquals(expected, customArray.getArray());
    }
}