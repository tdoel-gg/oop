package L1;

public class Student {
    private final String surname;
    private final String name;
    private final Group group;

    public Student(String surname, String name, Group group) {
        this.surname = surname;
        this.name = name;
        this.group = group;
    }

    public String info(){
        return surname + " " + name + ", " + group.getGroup() + "." + group.getSubgroup();
    }
}
