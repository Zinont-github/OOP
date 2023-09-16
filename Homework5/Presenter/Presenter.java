package Homework5.Presenter;

import mvp_try.ModelBlock.Model;
import mvp_try.Viewer.UserView;

public class Presenter {

    private Model model;

    private UserView viewer;

    public Presenter(UserView viewer) {
        model = new Model();
        this.viewer = viewer;
    }

    public void loadData() {
        model.loadDb("./users.bin");
    }

    public void saveData () {
        model.saveDb("./users.bin");
    }

    public void addUser(String name, String login, String password){
        model.addUser(name,login,password);
    }

    public void searchUser(String search) {
        model.searchUser(search);
    }

    public void removeUser(String search) {
        model.removeUser(search);
    }

    public void printAllUsers() {
        model.printUsers();
    }
}
