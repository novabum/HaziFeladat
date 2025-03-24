package AnimalKingdom;

public class WingedHandler extends AnimalHandler<Winged> {

    @Override
    public void handleAnimal(Winged wingedAnimal) {
        System.out.println("WingedHandler can handle"+ wingedAnimal.getName());    }
}
