package src.main.java;

import java.util.Iterator;
import java.util.List;

public class UserGroup<T extends User> implements Iterable<T>{
    List<T> userList;
    String name;
    int number; //количество учеников в группе


    public UserGroup(List<T> userList, String name, int number) {
        this.userList = userList;
        this.name = name;
        this.number = number;
    }
    public String toString() {
        return "Group" + name;
    }
    @Override
    public Iterator<T> iterator() {
        return new UserGroupIterator<T>(this);
    }
}
