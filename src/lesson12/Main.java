package lesson12;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();
        System.out.println(printer.getSerialNumber());
        System.out.println(printer.isBlackInkAvailable());

        Radio radio = new Radio();
        System.out.println("typ: " + radio.getModelName());
        System.out.println();

    }


}
