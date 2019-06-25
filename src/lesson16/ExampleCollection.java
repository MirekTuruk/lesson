package lesson16;

import java.util.ArrayList;
import java.util.List;

public class ExampleCollection {
    public static void main(String[] args) {

//        Utworzenie tablicy stringow
        String [] strings = new String[] {"jeden", "dwa", "trzy", "cztery"};

//        utworzenie kolekcji stringow
        List<String> stringList = new ArrayList<>();
        stringList.add("jeden");
        stringList.add("dwa");
        stringList.add("trzy");
        stringList.add("cztery");

//        iteracja na obiektach umieszczonych w tablicy
        for(String string : strings){
            System.out.println(string);
        }
        System.out.println("=====================================================================");
//         iteracja na obiektach umieszczonych w kolekcji danych
        for(String string : stringList){
            System.out.println(string);
        }
    }
}
