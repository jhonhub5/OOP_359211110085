package lab8;

public class Circle extends GraphicObject {

    private double r;
    static double PI = 3.141;




    public Circle (){}
    public Circle (double r){
        this.r = r;
    }

    @Override
    void findArea() {
        super.area = PI * (r * r);
        System.out.println("The area of Circle"+super.area);

        }

        public double getR(){
        return r;
        }

    }


