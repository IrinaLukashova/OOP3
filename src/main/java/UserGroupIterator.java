package src.main.java;

import java.util.Iterator;
import java.util.List;

public class UserGroupIterator<T extends User> implements Iterator<T> {
    List<T> userList;
    int counter;

    public UserGroupIterator(UserGroup<T> userGroup) {
        this.userList = userGroup.userList;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < userList.size();
    }

    @Override
    public T next() {
        if (hasNext()){
            return userList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if (hasNext())
            userList.remove(--counter);
    }
}
