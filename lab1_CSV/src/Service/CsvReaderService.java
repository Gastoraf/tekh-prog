package Service;

import Entity.Exam;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CsvReaderService {

    public HashMap<Integer, String[]> getData(String filePathCsv, Logger LOGGER){
        HashMap<Integer, String[]> dats = new HashMap<>();
        String[] data = null;

        LOGGER.log(Level.INFO,"Идет чтение файла...");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePathCsv))){

            String row;
            int i = 0;
            while ((row = bufferedReader.readLine()) != null) {
                data = row.split(";");
                assert false;
                dats.put(i, data);
                i++;
            }

        } catch (IOException ex){
            LOGGER.log(Level.WARNING,"Не получилось прочитать файл: " , ex);
        }
        LOGGER.log(Level.INFO,"Чтение файла закончено.");

        return dats;
    }

}
