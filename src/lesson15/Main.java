package lesson15;

public class Main {
    public static void main(String[] args) {

        PizzaDoughType pizzaDoughType1 = PizzaDoughType.MEDIUM;
        PizzaDoughType pizzaDoughType2 = PizzaDoughType.THICK;
        PizzaDoughType pizzaDoughType3 = PizzaDoughType.THIN;

        for (PizzaDoughType pizza : PizzaDoughType.values()) {
            System.out.println(pizza);
        }
    }
}





