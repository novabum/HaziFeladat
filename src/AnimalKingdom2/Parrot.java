package AnimalKingdom2;

public class Parrot extends Animal implements MovementType {

    public Parrot(String name) {
        super(name, new Winged());
    }

    @Override
    public void move() {
        System.out.println("I can fly");
    }

    @Override
    public void speak() {

    }
}
