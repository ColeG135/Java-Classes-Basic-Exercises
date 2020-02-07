class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = 10;
        height = 10;
    }

    double area() {
        return width * height;
    }
}

public class Rectangle.java {
    public static void main(String args[]) {
        Rectangle mybox1 = new Rectangle();
        double area;
        area = mybox1.area();
        System.out.println("Area is " + area);

    }
}
