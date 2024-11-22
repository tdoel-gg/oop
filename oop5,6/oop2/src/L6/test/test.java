package L6.test;

import L6.comparator.*;
import L6.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class test {
    Group group1 = new Group(1, 1, "Человек1");
    Student st1 = new Student("Один", "Паша", group1);
    Student st2 = new Student("Один", "Паша", group1);
    Student st3 = new Student("Один", "Паша", group1);

    Group group2 = new Group(3, 1, "Человек2");
    Student st4 = new Student("Два", "Сима", group2);
    
    @Test
    public void equalsHuman() {
        Assertions.assertEquals(st1, st1); //рефлексивность

        Assertions.assertEquals(st1, st2); //Симметричность
        Assertions.assertEquals(st2, st1);

        Assertions.assertEquals(st1, st2); //Транзитивность
        Assertions.assertEquals(st2, st3);
        Assertions.assertEquals(st3, st1);

        Assertions.assertEquals(st2, st3); //Постоянность
        Assertions.assertEquals(st2, st3);

        Assertions.assertEquals(st4, null);   // неравенство с null
    }

    @Test
    public void hashCodeHuman(){
        Assertions.assertEquals(st1.hashCode(), st2.hashCode()); //у равных объектов один hashCode
        Assertions.assertEquals(st2.hashCode(), st3.hashCode());
        Assertions.assertEquals(st1.hashCode(), st3.hashCode());
    }
    @Test
    public void sortGroup(){
        List<Group> groupList = Arrays.asList(group1, group2);
        Collections.sort(groupList);
    }

    @Test
    public void sortGroupComparator(){
        List<Group> groupList = Arrays.asList(group1, group2);
        SubgroupComparator subgroupComparator = new SubgroupComparator();
        Collections.sort(groupList, subgroupComparator);
    }

    @Test
    public void sortStudent(){
        List<Student> StudentList = Arrays.asList(st1,st2,st4);
        Collections.sort(StudentList);
    }

    @Test
    public void sortStudentComparator(){
        List<Student> StudentList = Arrays.asList(st1,st2,st4);
        SurnameComparator surnameComparator = new SurnameComparator();
        Collections.sort(StudentList, surnameComparator);

        NameComparator nameComparator = new NameComparator();
        Collections.sort(StudentList,nameComparator);
    }

}
