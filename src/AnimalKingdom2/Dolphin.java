package AnimalKingdom2;

public class Dolphin extends Animal{
    public Dolphin(MovementType movementType) {
        super(new Aquatic());
    }

    @Override
    public void speak() {
        System.out.println("Dolphin noises");
    }
}
