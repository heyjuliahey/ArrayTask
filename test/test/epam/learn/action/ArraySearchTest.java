package by.epam.arrayTask.action;

import by.epam.arrayTask.entity.CustomArray;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraySearchTest extends TestCase {
    CustomArray customArray;
    ArraySearch arraySearch;

    @BeforeClass
    public void setUp()
    {
        customArray = new CustomArray();
        arraySearch = new ArraySearch();
    }

    @Test
    public void testMin(int[] array, int expected)
    {
        customArray.setArray(array);
        int actual = arraySearch.min(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testMax(int[] array, int expected)
    {
        customArray.setArray(array);
        int actual = arraySearch.max(customArray);
        assertEquals(actual, expected);
    }
}