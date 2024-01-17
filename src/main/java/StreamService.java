package src.main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    StreamGroups streamGroups;

    public StreamService(StreamGroups streamGroups) {
        this.streamGroups = streamGroups;
    }

    public void soutStreamGroup(){
        for (Stream stream : streamGroups) {
            System.out.println("Stream consist of " + stream.studentGroupsList.size() + " groups.");
        }
    }

    public List<Stream> getSortedStream(){
        List<Stream> streamList = new ArrayList<>(streamGroups.streamList);
        streamList.sort(new StreamComparator());
        return streamList;
    }
}
