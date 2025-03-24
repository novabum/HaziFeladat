package TaskManager;

public class User extends UserData implements UserInterface {


    public User(String name, String email) {
        super(name, email);
    }

    @Override
    public String getName() {
        return name;
    }

}
