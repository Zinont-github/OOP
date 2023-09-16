package Homework5.ModelBlock;

public class Model {

    private int id;

    private UsersDB userdb;

    public Model() {
        userdb = new UsersDB();
    }

    public void saveDb(String path) {
        Loader<UsersDB> loader = new Loader<>();
        loader.write(path, userdb);
    }

    public UsersDB loadDb(String path) {
        Loader<UsersDB> loader = new Loader<>();
        userdb = (UsersDB) loader.read(path);
        return (UsersDB) loader.read(path);
    }

    public void addUser(String name, String username, String password) {
        userdb.addUser(new User(++id, name, username, password));
    }

    public void searchUser(String search) {
        userdb.searchUser(search);
    }

    public void removeUser(String searchstring) {
        userdb.removeUser(searchstring);
    }

    public void printUsers() {
        userdb.printAllUser();
    }
}