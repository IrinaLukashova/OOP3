package src.main.java;

import java.util.List;

public class TeacherController implements UserController<Teacher>{
    UserGroupService<Teacher> userGroupService;
    TeacherView view;
    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        return null;
    }

    @Override
    public void delete(String firstName, String secondName, String lastName) {
        userGroupService.removeUserByFIO(firstName,secondName,lastName);
    }

    public void viewListOfTeachers(){
        view.sendOnConsole(userGroupService.userGroup.userList);
    }


}
