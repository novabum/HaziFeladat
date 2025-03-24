package AnimalKingdom2;

public class MasterHandler implements Handle{

    @Override
    public void handle(Animal animal) {
        System.out.println("I can handle every Animal");
    }
}
