package by.epam.arrayTask.reader;

import by.epam.arrayTask.entity.CustomArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CustomFileReader {
    int size;

    public void read(CustomArray customArray) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        size = sc.nextInt();
        customArray = new CustomArray(size);

        for(int i = 0; i < size; i++)
            customArray.setElement(i, sc.nextInt());
    }
}