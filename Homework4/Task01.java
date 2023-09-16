package Homework4;


public class Task01 {
    public static void main(String[] args) {
        printElement(10);
        printElement("Синкопа - это выпадение звуков внутри слова");
    }

    static <T> void printElement(T element) {
        System.out.println(element);
    }
}

