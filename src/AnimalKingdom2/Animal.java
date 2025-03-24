package AnimalKingdom2;

public abstract class Animal {
    protected String name;
    protected MovementType movementType;


    public Animal(String name, MovementType movementType) {
        this.name = name;
        this.movementType = movementType;
    }

    public void move(){
        movementType.move();
    }

    public abstract void speak();

    public MovementType getMovementType() {
        return movementType;
    }
}
