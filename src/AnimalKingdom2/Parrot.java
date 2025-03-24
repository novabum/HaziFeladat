package AnimalKingdom2;

public class Parrot extends Animal implements MovementType {

    public Parrot() {
        super(new Winged());
    }

    @Override
    public void move() {
        System.out.println("I can fly");
    }

    @Override
    public void speak() {
        System.out.println("Arrr, I'm a pirate");
    }
}
