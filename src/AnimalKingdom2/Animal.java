package AnimalKingdom2;

public abstract class Animal {
    protected MovementType movementType;


    public Animal(MovementType movementType) {
        this.movementType = movementType;
    }

    public void move(){
        movementType.move();
    }

    public abstract void speak();
}
