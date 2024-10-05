package L1;

public class Teacher extends Student {

    private final String language;

    public Teacher(String surname, String name, Group group, String language) {
        super(surname, name, group);
        this.language = language;
    }

    @Override
    public String info(){
        return super.info() + ", " + language;
    }
}
