import Entity.Exam;
import Entity.Testing;
import Service.CreditService;
import Service.CsvReaderService;
import Service.ExamService;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.*;

public class Main {

    static Logger LOGGER;
    static {
        try(FileInputStream ins = new FileInputStream(".\\log.config")){ //
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Main.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LOGGER.log(Level.WARNING,"Начало main, создаем CsvReaderService");

        CsvReaderService  csvReaderService = new CsvReaderService();
        CreditService creditService = new CreditService();
        ExamService examService = new ExamService();
        String filePath = "C:\\\\Users\\\\Alexey.Rudianov\\\\Desktop\\\\Study.csv";

        HashMap<Integer, String[]> dats = csvReaderService.getData(filePath, LOGGER);

        creditService.saveList(dats);


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt")))
        {


//            Testing testing = new Exam(); --------------нужно использовать
            Person p = new Person("Sam", 33, 178, true);
            oos.writeObject(p);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat")))
        {
            Person p=(Person)ois.readObject();
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }



//    public static void main(String[] args) throws IOException {
////        BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\Alexey.Rudianov\\Desktop\\Study.csv"));
////        String row;
////        while ((row = csvReader.readLine()) != null) {
////            String[] data = row.split(";");
////            System.out.println();
////        }
////        csvReader.close();
//
//
//
//    }
}

class Person implements Serializable{

    private String name;
    private int age;
    private double height;
    private boolean married;

    Person(String n, int a, double h, boolean m){

        name=n;
        age=a;
        height=h;
        married=m;
    }
    String getName() {return name;}
    int getAge(){ return age;}
    double getHeight(){return height;}
    boolean getMarried(){return married;}
}