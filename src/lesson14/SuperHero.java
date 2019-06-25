package lesson14;

public class SuperHero implements Flyable, Swimmable{

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}
