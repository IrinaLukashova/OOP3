package src.main.java;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    public int compare(Stream o1, Stream o2) {
        if (o1.studentGroupsList.size()>o2.studentGroupsList.size())
            return 1;
        if (o1.studentGroupsList.size()<o2.studentGroupsList.size())
            return -1;
        else
            return 0;
    }
}
