package lesson18;

import java.util.Map;
import java.util.Set;

public class ExampleSystemMap {
    public static void main(String[] args) {

        Map<String, String> getenv = System.getenv();
        Set<String> keySet = getenv.keySet();

        for(String key : keySet){
            System.out.println("Zmienna systemowa: " + key + "ma wartość: " + getenv.get(key));
        }
    }
}