package Homework5.ModelBlock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UsersDB implements Serializable {

    private List<User> users;
    private int currentId;

    public UsersDB() {
        users = new ArrayList<>();
        currentId = 1;
    }

    public void addUser(User user) {
        user.setId(currentId);
        users.add(user);
        currentId++;
    }

    public boolean searchUser(String searchstring) {
        if (searchstring != null) {
            for (User user : users) {
                if (user.toString().contains(searchstring)) {
                    System.out.println(user);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeUser(String searchstring) {
        if (searchstring != null) {
            User userToRemove = null;
            for (User user : users) {
                if (user.toString().contains(searchstring)) {
                    userToRemove = user;
                    break;
                }
            }
            if (userToRemove != null) {
                users.remove(userToRemove);
                return true;
            }
        }
        return false;
    }


    public void printAllUser() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}