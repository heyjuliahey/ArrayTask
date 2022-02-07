package by.epam.arrayTask.action;

import by.epam.arrayTask.entity.CustomArray;

public class ArraySort {

    public int[] InsertionSort(CustomArray array) {
        int size = array.getSize();
        int[] arr = array.getArray();

        for(int i = 1; i < size; i++)
        {
            int current = arr[i];

            int j = i - 1;
            while(j >= 0 && arr[j] > current)
            {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public int[] SelectionSort(CustomArray array) {
        int[] arr = array.getArray();
        int size = array.getSize();
        int min, min_index, temp;

        for(int i = 0; i < size; i++)
        {
            min = arr[i];
            min_index = i;

            for(int j = i; j < size; j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    min_index = j;
                }
            }

            if(min < arr[i])
            {
                temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
        return arr;
    }

    public int[] BubbleSort(CustomArray customArray)
    {
        int[] array = customArray.getArray();
        int size = customArray.getSize();
        int temp;

        for(int i = 0; i < size; i++)
        {
            for(int j = 1; j < size - i; j++)
            {
                if(array[j - 1] > array[j])
                {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
