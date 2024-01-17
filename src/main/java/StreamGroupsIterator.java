package src.main.java;

import java.util.Iterator;
import java.util.List;

public class StreamGroupsIterator implements Iterator<Stream> {
    List<Stream> streamList;
    int counter;

    public StreamGroupsIterator(StreamGroups streamGroups) {
        this.streamList = streamGroups.streamList;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < streamList.size();
    }

    @Override
    public Stream next() {
        if (hasNext()){
            return streamList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if (hasNext())
            streamList.remove(--counter);
    }
}
