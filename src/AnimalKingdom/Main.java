package AnimalKingdom;

public class Main {
    public static void main(String[] args) {

        //A szárnyasokkal fogok kísérletezni, a többi marad csontváz.
        var bat1 = new Bat("DenevérPajti");
        bat1.speak();
        var cat1 = new Cat();

        WingedHandler wingedHandler = new WingedHandler();
        wingedHandler.handleAnimal(bat1);

        MasterHandler masterHandler = new MasterHandler();
        masterHandler.handleAnimal(cat1);
        masterHandler.handleAnimal(bat1);

        LandHandler landHandler = new LandHandler();
        landHandler.handleAnimal(cat1);
//        landHandler.handleAnimal(bat1); //ez jó!






    }
}
