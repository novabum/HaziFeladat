package AnimalKingdom2;

public class WingedHandler implements Handle{

    @Override
    public void handle(Animal animal) {
        if(animal.movementType instanceof Winged) {
            System.out.println("I handle winged animals");
        }
        else System.out.println("Cannot handle this Animal, as it is not winged.");
    }
}
