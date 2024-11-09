package L1;

public abstract class Human implements Courses {
    private final String surname;
    private final String name;

    public Human(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
    public String info(){
        return name + " " + surname;
    }
}
