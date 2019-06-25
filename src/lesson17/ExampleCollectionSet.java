package lesson17;

import java.util.HashSet;
import java.util.Set;

public class ExampleCollectionSet {

    public static void main(String[] args) {

//        dodanie elementów do kolekcji

        Set<String> strings = new HashSet<>();
        strings.add("Jeden");
        strings.add("Dwa");
        strings.add("Dwa");
        strings.add("Trzy");
        strings.add("Cztery");
        strings.add("Cztery");

//        wyświetlenie zawartości kolekcji

        for(String string : strings){
            System.out.println(string);
        }
//        wyświetlenie ilości elementów w kolekcji
        System.out.println(strings.size());

//        sprawdzenie czy w kolekcji występują dane
        System.out.println(strings.contains("Dwa"));

//        usunięcie elementu "Dwa"
        strings.remove("Dwa");
        System.out.println(strings.contains("Dwa"));
        System.out.println(strings.contains("Adam"));

//        sprawdzanie czy kolekcja jest pusta
        System.out.println(strings.isEmpty());

//        wyczyszczenie kolekcji
        strings.clear();
        System.out.println(strings.isEmpty());
    }
}
