package Chapter7;

public class Test7E2 {

}

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape(double w, double h, String s) {
        width = w;
        height = h;
        name = s;
    }

    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w) {width = w;}
    void setHeight(double h) {height = h;}

    String getName() {return name;}

    void showDim() {
        System.out.println("Width and height: " + width + " and " + height);
    }

    abstract double area();
}

class Circle extends TwoDShape {

    Circle() {
        super();
    }

    Circle(double x) {
        super(x, "circle");
    }

    Circle(Circle ob) {
        super(ob);
    }

    double area() {
        return 3.1416 * (getWidth() / 2) * (getWidth() / 2);
    }
}
