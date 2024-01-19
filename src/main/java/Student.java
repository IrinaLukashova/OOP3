package src.main.java;

public class Student extends User{

    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(studentId, firstName,secondName,lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + super.userId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

}
