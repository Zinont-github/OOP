package Seminar4OOP;

public class Gen<T,V> {
    private T ob;// Объявить объект типа Т
    private V ob2;
    public Gen(T ob,V ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    public T getOb() {
        return ob;
    }

    public V getOb2() {
        return ob2;
    }

    void showType() {
        System.out.println("Тип Т это " + ob.getClass().getName());
        System.out.println("Тип V это " + ob2.getClass().getName());
    }
}
