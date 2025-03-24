package AnimalKingdom2;

public class LandHandler implements Handle{

    @Override
    public void handle(Animal animal) {
        if (animal.movementType instanceof Land) System.out.println("I can handle land animals");
        else System.out.println("This is not a land animal. I can't handle it");
    }
}
