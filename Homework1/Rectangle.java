package Homework1;


public class Rectangle implements ICalculateArea, IConst, IDefautl {
    private int width;
    private int height;
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    Rectangle(){
        width = 4;
        height = 5;
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    int calculateArea () {
        return (getWidth() * getHeight() / 2);
    }
    int calculatePerimeter () {
        return (2 *(getWidth() * getHeight() / 2));
    }

    @Override
    public void print() {
        System.out.println(calculateArea());
    }

    public static void main(String[] args) {
        System.out.println("Периметр равен: " + WIDTH * HEIGHT);
        widthHeight wh = new widthHeight();
        System.out.println("ширина: " + wh.even());
        System.out.println("высота: " + wh.odd());
    }

    public static class widthHeight implements IDefautl{
        @Override
        public int even() {
            return 24;
        }

        @Override
        public int odd() {
            return 6;
        }
    }



}
