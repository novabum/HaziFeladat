package AnimalKingdom;

import java.util.ArrayList;
import java.util.List;

public class AquaticHandler extends MasterAnimalHandler<AquaticAnimals> {
    List<Animal> asd = new ArrayList<>();

    public void handleAnimal(AquaticAnimals animal) {
        System.out.println("AquaticHandler handles aquatics: " + animal.getName());
    }
}
