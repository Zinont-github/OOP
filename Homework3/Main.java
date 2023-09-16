package Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // создаём список студентов для сортировки
        List<Student> students = new ArrayList<>(7);
        students.add(new Student("Ivanov", "Ivan", 22, "male", 4.7));
        students.add(new Student("Petrov", "Oleg", 25, "male", 5.0));
        students.add(new Student("Denisova", "Olga", 23, "female", 4.7));
        students.add(new Student("Popov", "Victor", 27, "male", 3.9));
        students.add(new Student("Titova", "Galina", 22, "female", 5.0));
        students.add(new Student("Antonov", "Alex", 21, "male", 4.2));
        students.add(new Student("Nilov", "Pavel", 28, "male", 4.7));

        System.out.println("Неотсортированный список студентов:");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("___".repeat(20) + "\n");

        // Создаем компаратор для сравнения студентов по среднему баллу оценок и возрасту при равенстве оценок
        Comparator<Student> markComparator = new Comparator<Student>() {
            @Override
            public int compare(Student stud1, Student stud2) {
                if (stud1.getAverageMark() - stud2.getAverageMark() > 0) {
                    return -1;
                } else if (stud1.getAverageMark() - stud2.getAverageMark() < 0) {
                    return 1;
                }
                // если оценки равны, то далее сортируем по возрасту
                if (stud1.getAge() > stud2.getAge()) {
                    return -1;
                } else if (stud1.getAge() < stud2.getAge()) {
                    return 1;
                }
                return 0;
            }
        };

        // Сортируем по оценкам с использованием компаратора
        Collections.sort(students, markComparator);
        System.out.println("Список студентов в зависимости от успеваемости:");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("___".repeat(20) + "\n");

        // Компаратор для сравнения студентов по возрасту через лямбда выражение
        Comparator<Student> ageComparator = (stud1, stud2) -> {
            if (stud1.getAge() - stud2.getAge() > 0) {
                return -1;
            } else if (stud1.getAge() - stud2.getAge() < 0) {
                return 1;
            }
            return 0;
        };

        // Сортируем по возрасту с использованием компаратора для списка, а не для Collections
        students.sort(ageComparator);
        System.out.println("Список студентов, отсортированный по возрасту:");
        for (Student stud : students) {
            System.out.println(stud);
        }

        System.out.println("___".repeat(20) + "\n");

        // Компаратор для сортировки студентов по фамилии через лямбда выражение
        Comparator<Student> lastnameComparator = (stud1, stud2) -> stud1.getLastName().compareTo(stud2.getLastName());

        // Сортируем по фамилии с использованием компаратора для списка, а не для Collections
        students.sort(lastnameComparator);
        System.out.println("Список студентов, отсортированный по фамилии:");
        for (Student stud : students) {
            System.out.println(stud);
        }
    }
}