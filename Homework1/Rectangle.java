package Homework1;


public class Rectangle {
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
}
