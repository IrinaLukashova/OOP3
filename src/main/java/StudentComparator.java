package src.main.java;
import java.util.Comparator;
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComporation = o1.secondName.compareTo(o2.secondName);
        if (resultOfComporation == 0){
            resultOfComporation = o1.firstName.compareTo(o2.firstName);
            if (resultOfComporation ==0){
                return o1.lastName.compareTo(o2.lastName);
            } else {
                return resultOfComporation;
            }
        } else{
            return resultOfComporation;
        }
    }
}
