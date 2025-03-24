package AnimalKingdom;

public class MasterHandler extends AnimalHandler<Animal> {

    @Override
    public void handleAnimal(Animal animal) {
        System.out.println("Master handles any animal");
    }
}
