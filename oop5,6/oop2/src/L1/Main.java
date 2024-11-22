package L1;

import L1.exception.IndexOutOfBounds;
import L1.exception.FileNullException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Courses student = new Student("1", "Вячеслав", new Group(7, 2));
        Courses student2 = new Student("2", "Вячеслав", new Group(7, 2));
        Courses student3 = new Student("3", "Вячеслав", new Group(7, 2));
        Courses teacher = new Teacher("Стрельникова", "Марина", new Group(6, 1), "english");

        //student.people();
        //teacher.people();
        List<Courses> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(student3);

        try {
            Starosta.checkIndex(1, list);
        } catch (IndexOutOfBounds e) {
            System.out.println(e.getMessage());
        }

        try {
            FileReader f = new FileReader("C:/Users/Admin/Desktop/oop2/src/file");

            Starosta.outLine(f);
        } catch (FileNullException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}