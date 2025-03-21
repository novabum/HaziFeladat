package AnimalKingdom;

public class Parrot extends WingedAnimals implements Animal, Winged{
    @Override
    public void fly() {
        System.out.println("Colored wings flap flap");
    }

    @Override
    public void speak() {
        System.out.println("Arrrrr, I am a pirate!");
    }

    @Override
    public String getName() {
        return "";
    }
}
