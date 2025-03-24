package AnimalKingdom2;

public class Seal extends Animal{

    public Seal() {
        super(new Aquatic());
    }

    @Override
    public void speak() {
        System.out.println("Seal noises");
    }
}
