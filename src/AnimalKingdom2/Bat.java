package AnimalKingdom2;

public class Bat extends Animal {

    public Bat(String name) {
        super(name, new Winged());
    }

    @Override
    public void speak() {
        System.out.println("I AM BATMAN");
    }
}
