package AnimalKingdom;

public class Dolphin extends AquaticAnimals implements Animal, Aquatic {
    @Override
    public void speak() {
        System.out.println("EEeeeee eeeee");
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void swim() {
        System.out.println("Dolphin slpashes");
    }
}
