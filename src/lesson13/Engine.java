package lesson13;

public class Engine {
    private Cooler cooler;
    private SparkPlug sparkPlug = new SparkPlug();

    public Engine(){
        System.out.println("Konstruktor Engine zostal wywolany");
        this.cooler = new Cooler();
    }
}
