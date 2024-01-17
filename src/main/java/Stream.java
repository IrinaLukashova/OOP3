package src.main.java;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Student>{
    List<StudentGroup> studentGroupsList;


    public Stream(List<StudentGroup> studentGroupsList) {
        this.studentGroupsList = studentGroupsList;
    }
    public String toString() {
        return "Stream consist of " + studentGroupsList.size() + " groups.";
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
