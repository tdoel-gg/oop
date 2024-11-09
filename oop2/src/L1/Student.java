package L1;

public class Student extends Human {
    private final Group group;

    public Student(String surname, String name, Group group) {
        super(name, surname);
        this.group = group;
    }

    public String info(){
        return super.info() + ", " + group.getGroup() + "." + group.getSubgroup();
    }
    @Override
    public void people() {
        System.out.println("Студент: " + info());
    }
}
