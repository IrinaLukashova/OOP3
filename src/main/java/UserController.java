package src.main.java;

public interface UserController<T extends User> {
    public T create(String firstName, String secondName, String lastName);
    public void delete(String firstName, String secondName, String lastName);
}
