package AnimalKingdom;

public class WingedHandler extends MasterAnimalHandler<WingedAnimals> {

    @Override
    public void handleAnimal(WingedAnimals animal) {
        System.out.println("WingedHandler drinks RedBull: " + animal.getName());
    }
}
