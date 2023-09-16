package Homework5.ModelBlock;

import java.io.Serializable;

public class User implements Serializable {

    private int id;

    private String name;
    private String username;

    private String password;

    public User(int id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean setPassword(String password) {
        if (password != null && password.length() > 5) {
            this.password = password;
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    int setId(int id) {
        return this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" + id + " : " + name + " " + username + "}";
    }

}