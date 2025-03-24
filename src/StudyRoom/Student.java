package StudyRoom;

//feladat 3:
//hallgatók vizsgaeredmény rendszer
//hallgató: név, id
//vizsgainfó: tantárgy, score
//        Tracker nyilvántartja, melyik kié.


public class Student {
    private String name;
    private Integer id;

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

}
