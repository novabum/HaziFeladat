package AnimalKingdom;

public class LandHandler extends AnimalHandler<Land> {

    @Override
    public void handleAnimal(Land animal) {
        System.out.println("LandHandler only handles" + animal.getName());    }
}
