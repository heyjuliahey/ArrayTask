package by.epam.arrayTask.reader;

import by.epam.arrayTask.exception.CustomException;

import java.io.*;
import java.util.ArrayList;

public class CustomFileReader {
   public String readFromFile(String fileName) throws CustomException {
       File file = new File(fileName);
       ArrayList<String> array = new ArrayList<>();

       if(file.exists() && file.length() == 0)
       {
            throw new CustomException("file is empty");
       }

       try(BufferedReader reader = new BufferedReader(new FileReader(file)))
       {
            String tmp;
            while((tmp = reader.readLine()) != null)
            {
                array.add(tmp);
            }
       }
       catch(IOException e)
       {
           e.printStackTrace();
           throw new CustomException(e);
       }
       return fileName;
   }
}
