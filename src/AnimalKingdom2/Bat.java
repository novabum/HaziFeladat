package AnimalKingdom2;

public class Bat extends Animal {

    public Bat() {
        super(new Winged());
    }

    @Override
    public void speak() {
        System.out.println("Ich bin Batman");
    }
}
