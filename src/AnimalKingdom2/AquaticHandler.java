package AnimalKingdom2;

public class AquaticHandler implements Handle{

    @Override
    public void handle(Animal animal) {
        if (animal.movementType instanceof Aquatic) System.out.println("I handle aquatic animals");
        else System.out.println("This is not an aquatic animal");
    }
}
