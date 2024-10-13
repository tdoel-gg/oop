package L1;

public class Teacher extends Human {
    private final Group group;
    private final String language;

    public Teacher(String surname, String name, Group group, String language) {
        super(surname, name);
        this.group = group;
        this.language = language;
    }

    @Override
    public String info(){
        return super.info() + ", " + group.getGroup() + "." + group.getSubgroup() + ", " + language;
    }
}