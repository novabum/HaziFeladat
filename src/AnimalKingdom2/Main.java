package AnimalKingdom2;

public class Main {
    public static void main(String[] args) {
        Bat bat1 = new Bat();
        bat1.move();
        bat1.speak();
        System.out.println("-");
        Dog dog1 = new Dog();
        dog1.speak();
        dog1.move();
        System.out.println("-");
        var seal1 = new Seal();
        seal1.speak();
        seal1.move();
        System.out.println("-");

        var wingedHandler = new WingedHandler();
        var landHandler = new LandHandler();
        var aquaticHandler = new AquaticHandler();
        wingedHandler.handle(bat1);
        landHandler.handle(dog1);
        aquaticHandler.handle(seal1);


        System.out.println("Nem tudják kezelni\n");
        wingedHandler.handle(dog1);
        aquaticHandler.handle(bat1);
        landHandler.handle(seal1);

        System.out.println("MaserHandler teszt:\n");
        var masterhandler = new MasterHandler();
        masterhandler.handle(dog1);
        masterhandler.handle(seal1);
        masterhandler.handle(bat1);



    }
}
