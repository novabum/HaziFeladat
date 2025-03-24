package AnimalKingdom;


public class Cat extends Land implements LandAnimal{


    @Override
    public void speak() {
        System.out.println("Meow");

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void run() {
        System.out.println("Tiny paws scratching on your sofa");
    }
}
