package Homework1;

public class Task1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka", 5);
        Owner owner = new Owner("Vladimir");
        System.out.println("Мяу! Меня зовут " + cat.getName() +  " Мне " + cat.getAge() + " лет. Мой владелец " + owner.getName1());


    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Owner {
    private String name1;

    public Owner(String name1){
        this.name1 = name1;
    }

    public String getName1() {
        return name1;
    }
}