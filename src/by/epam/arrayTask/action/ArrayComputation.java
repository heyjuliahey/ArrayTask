package by.epam.arrayTask.action;

import by.epam.arrayTask.entity.CustomArray;

public class ArrayComputation {

    public int average(CustomArray array)
    {
        int sum = sum(array);

        return sum / array.getSize();
    }

    public int sum(CustomArray array)
    {
        int sum = 0;
        int size = array.getSize();

        for(int i = 0; i < size; i++)
            sum += array.getElement(i);

        return sum;
    }

    public int positiveElementsCount(CustomArray array)
    {
        int count = 0;
        int size = array.getSize();

        for(int i = 0; i < size; i++)
        {
            if(array.getElement(i) > 0)
            {
                count++;
            }
        }
        return count;
    }

    public int negativeElementsCount(CustomArray array)
    {
        int count = 0;
        int size = array.getSize();

        for(int i = 0; i < size; i++)
        {
            if(array.getElement(i) < 0)
            {
                count++;
            }
        }
        return count;
    }

    public void replaceElement(CustomArray array)
    {
        for(int i = 0; i < array.getSize(); i++)
        {
            if(array.getElement(i) > 5)
                array.setElement(i, 0);
        }
    }
}