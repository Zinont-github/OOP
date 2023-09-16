package Homework5.ModelBlock;

public interface UIWriteable <T> {

    void write(String path, T object);

    Object read(String path);
}
