package src.main.java;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<UserGroup>, Comparable<Student>{
    List<UserGroup> studentGroupsList;


    public Stream(List<UserGroup> studentGroupsList) {
        this.studentGroupsList = studentGroupsList;
    }
    public String toString() {
        return "Stream consist of " + studentGroupsList.size() + " groups.";
    }
    @Override
    public Iterator<UserGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
