package L6.model;


import java.util.Objects;

public class Student implements Comparable<Student>{
    private String surname;
    private String name;
    private Group group;

    public Student(String surname, String name, Group group) {
        this.surname = surname;
        this.name = name;
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(surname, student.surname) && Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, group);
    }

    @Override
    public int compareTo(Student o) {
        return this.group.compareTo(o.group);
    }
}
