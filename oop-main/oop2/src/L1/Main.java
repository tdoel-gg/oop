package L1;

public class Main {

    public static void main(String[] args) {

        Courses student = new Student("Ковалёв", "Вячеслав", new Group(7, 2));
        Courses teacher = new Teacher("Стрельникова", "Марина", new Group(6, 1), "english");

        student.people();
        teacher.people();
    }
}