package lab8;

public class Triangle extends GraphicObject {

    private double h;
    private double b;


    public Triangle (){

    }
    public Triangle (double h, double b){
        this.h = h;
        this.b = b;
    }

    @Override
    void findArea() {

        super.area = 0.5*h*b;

        System.out.println("the area of Circle"+super.area);


    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
