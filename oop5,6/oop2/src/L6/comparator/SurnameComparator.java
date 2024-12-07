package L6.comparator;

import L6.model.Student;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}