package AnimalKingdom;

public class Main {
    public static void main(String[] args) {

        //A szárnyasokkal fogok kísérletezni, a többi marad csontváz.
        var bat1 = new Bat("DenevérPajti");
        bat1.speak();

        WingedHandler wingedHandler = new WingedHandler();
        wingedHandler.handleAnimal(bat1);

        LandHandler landHandler = new LandHandler();
        //landHandler.handleAnimal(bat1); HIBA SZUPERSÉG!

        var masterHandler = new MasterAnimalHandler<>();
        masterHandler.handleAnimal(bat1);

    }
}
