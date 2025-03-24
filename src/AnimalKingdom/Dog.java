package AnimalKingdom;

public class Dog extends Animal implements LandAnimal{
    @Override
    public void speak() {
        System.out.println("Bark");
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void run() {
        System.out.println("Big dog paws stepping on your feet");
    }
}
