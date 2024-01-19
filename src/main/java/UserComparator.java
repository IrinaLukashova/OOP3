package src.main.java;
import java.util.Comparator;
public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOfComporation = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComporation == 0){
            resultOfComporation = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComporation ==0){
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultOfComporation;
            }
        } else{
            return resultOfComporation;
        }
    }
}
