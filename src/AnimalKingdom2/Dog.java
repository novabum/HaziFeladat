package AnimalKingdom2;

public class Dog extends Animal{


    public Dog() {
        super(new Land());
    }

    @Override
    public void speak() {
        System.out.println("Woof woof");
    }
}
