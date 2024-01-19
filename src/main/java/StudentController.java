package src.main.java;

public class StudentController implements UserController<Student>{

    UserGroupService<Student> service;

    public StudentController(UserGroupService<Student> service) {
        this.service = service;
    }

    @Override
    public Student create(String firstName, String secondName, String lastName) {
        return new Student(1, firstName, secondName, lastName);
    }

    @Override
    public void delete(String firstName, String secondName, String lastName) {
        service.removeUserByFIO(firstName,secondName,lastName);
    }

}
