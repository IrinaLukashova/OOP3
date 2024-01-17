package src.main.java;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    List<Student> studentList;
    String name;
    int number; //количество учеников в группе


    public StudentGroup(List<Student> studentList, String name, int number) {
        this.studentList = studentList;
        this.name = name;
        this.number = number;
    }
    public String toString() {
        return "Group" + name;
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
