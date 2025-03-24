package AnimalKingdom;

public abstract class AnimalHandler<T extends Animal> {

   protected abstract void handleAnimal(T animal);

}
