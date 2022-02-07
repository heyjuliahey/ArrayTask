package by.epam.arrayTask.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray(int size)
    {
        array = new int[size];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize()
    {
        return array.length;
    }

    public void setElement(int index, int value)
    {
        this.array[index] = value;
    }

    public int getElement(int index)
    {
        return array[index];
    }

    public String toString()
    {
        return Arrays.toString(this.array);
    }
}
