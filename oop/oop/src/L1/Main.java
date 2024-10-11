package L1;

public class Main {

        public static void main(String[] args) {

                Student student = new Student("Ковалёв", "Вячеслав", new Group(7, 2));
                Teacher teacher = new Teacher("Стрельникова", "Марина", new Group(6, 1), "english");

                System.out.println(student.info());
                System.out.println(teacher.info());

        }
}