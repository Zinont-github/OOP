package Homework4;


public class Task02 {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strings = {"One", "Two", "Three", "Four", "Five", "Six, Seven", "Eight", "Nine", "Ten"};
        printArray(nums);
        System.out.println();
        printArray(strings);
    }

    static <T> void printArray(T[] array) {
        for (T el : array) {
            System.out.print(el + " ");
        }
    }
}

