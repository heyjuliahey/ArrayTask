package test.epam.learn.action;

import by.epam.arrayTask.exception.CustomException;
import by.epam.arrayTask.reader.CustomFileReader;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

class CustomFileReaderTest {
    CustomFileReader fileReader;
    static final String fileName = "input.txt";

    @BeforeClass
    public void setUp()
    {
        fileReader = new CustomFileReader();
    }

    @AfterClass
    public void tearDown()
    {
        fileReader = null;
    }

    @Test
    public void CustomFileReaderTest () throws CustomException {
        String actual = fileReader.readFromFile(fileName);
        String expected = "15, 28, 0, -7, 9, 31";
        Assert.assertEquals(actual, expected);
    }
}
