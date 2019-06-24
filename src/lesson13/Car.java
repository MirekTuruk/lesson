package lesson13;

public class Car {
    private Engine engine;
    private SteeringWheel steeringWheel = new SteeringWheel();

    public Car(){
        System.out.println("Konstruktor Car zostal wywolany");
        this.engine = new Engine();
    }
}
