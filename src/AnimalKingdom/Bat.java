package AnimalKingdom;

public class Bat extends Winged implements WingedAnimal {
    private String name;

    public Bat(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("Gimme your blood");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("Flappy wings say whooos");
    }
}
