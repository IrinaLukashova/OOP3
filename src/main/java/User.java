package src.main.java;

public class User implements Comparable<User> {
    int userId;
    private String firstName;
    private String secondName;
    private String lastName;

    public User(int userId, String firstName, String secondName, String lastName) {
        this.userId = userId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int compareTo(User o) {
        if (userId > o.userId)
            return 1;
        if (userId < o.userId)
            return -1;
        return 0;
    }
}
