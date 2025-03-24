package AnimalKingdom2;

public class Main {
    public static void main(String[] args) {
        Bat bat1 = new Bat();
        bat1.move();
        var wingedHandler = new WingedHandler();

        wingedHandler.handle(bat1);

    }
}
