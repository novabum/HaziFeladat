package TaskManager;

public abstract class UserData {

    //Van-e értelme abstract Classokat létrehozni csak azért, hogy a userek közös
    //jellemzőit itt tároljuk?

    String name;
    String email;

    public UserData(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
