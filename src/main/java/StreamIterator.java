package src.main.java;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    List<StudentGroup> studentGroupsList;
    int counter;

    public StreamIterator(Stream stream) {
        this.studentGroupsList = stream.studentGroupsList;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroupsList.size();
    }

    @Override
    public StudentGroup next() {
        if (hasNext()){
            return studentGroupsList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if (hasNext())
            studentGroupsList.remove(--counter);
    }
}
