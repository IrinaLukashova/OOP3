package src.main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserGroupService <T extends User> {
    UserGroup<T> userGroup;

    public UserGroupService(UserGroup<T> userGroup) {
        this.userGroup = userGroup;
    }

    public void removeUserByFIO(String firstName, String secondName, String lastName){
        UserGroupIterator<T> iterator = new UserGroupIterator<T>(userGroup);
        while (iterator.hasNext()){
            User userItem = iterator.next();
            if (userItem.getFirstName().equals(firstName) &&
                    userItem.getSecondName().equals(secondName)&&
                    userItem.getLastName().equals(lastName)){
                iterator.remove();
            }
//        for ( Student studentItem : studentGroup) {
//            if (studentItem.firstName.equals(firstName) &&
//            studentItem.secondName.equals(secondName)&&
//            studentItem.lastName.equals(lastName))
//                studentGroup.studentList.remove(studentItem);

        }
    }

    public void soutStudentGroup(){
        for (T user : userGroup) {
            System.out.println(user);
        }
    }

    public List<T> getSortedStudentGroupById(){
        List<T> userList = new ArrayList<>(userGroup.userList);
        Collections.sort(userList);
        return userList;
    }

    public List<T> getSortedStudentGroupByFIO(){
        List<T> studentList = new ArrayList<>(userGroup.userList);
        studentList.sort(new UserComparator());
        return studentList;
    }
}
