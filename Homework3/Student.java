package Homework3;

public class Student {
    private String lastName;
    private String firstName;
    private int age;
    private String gender;
    private double averageMark;

    // конструктор
    public Student(String lastName, String firstName, int age, String gender, double averageMark) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.averageMark = averageMark;
    }

    // переопределяем toString()
    @Override
    public String toString() {
        return String.format("%s %s, age: %d, gender: %s, mark: %.1f", lastName, firstName, age, gender, averageMark);
    }

    // геттеры
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String gender() {
        return gender;
    }

    public double getAverageMark() {
        return averageMark;
    }

    // сеттеры

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(String gender) {
        this.gender = gender;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}