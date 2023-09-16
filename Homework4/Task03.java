package Homework4;

public class Task03 {
    public static void main(String[] args) {
        getMax(10, 20);
        getMax("Это маленькая строка", "Это ну очень большая и длинная строка");
        getMax(10.3, 3.4);
    }
    static <T extends Comparable<T>> void getMax(T prm, T prm2) {
        if (prm.compareTo(prm2) > 0) {
            System.out.println("Первое значение больше второго");
        }
        if (prm.compareTo(prm2) < 0) {
            System.out.println("Второе значение больше первого");
        }
        if (prm.compareTo(prm2) == 0) {
            System.out.println("Значения равны между собой");
        }
    }
}