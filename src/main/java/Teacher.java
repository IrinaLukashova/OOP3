package src.main.java;

public class Teacher extends User{
    String subject;


    public Teacher(int userId, String firstName, String secondName, String lastName, String subject) {
        super(userId, firstName, secondName, lastName);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + userId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", subject='" + subject + '}';
    }

}
