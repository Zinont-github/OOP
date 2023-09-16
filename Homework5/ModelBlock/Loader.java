package Homework5.ModelBlock;

import java.io.*;

public class Loader<T extends UsersDB> implements UIWriteable {

    @Override
    public void write(String path, Object output) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(new File(path)))) {
            objectOutputStream.writeObject(output);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    @Override
    public Object read(String path) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {
            return objectInputStream.readObject();
        } catch (IOException e) {
            System.out.println("Error reading");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
