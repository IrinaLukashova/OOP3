package src.main.java;

import java.util.Iterator;
import java.util.List;

public class StreamGroups implements Iterable<Stream>{
    List<Stream> streamList;



    public StreamGroups(List<Stream> streamList) {
        this.streamList = streamList;

    }
    @Override
    public Iterator<Stream> iterator() {
        return new StreamGroupsIterator(this);
    }
}
