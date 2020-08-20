
public class Calculations {

    void info(){
        System.out.println("This Project Is For Computing Areas of Shapes...");
        System.out.println("In This Project We Are Computing Area of Circle And Square..");
    }
    public static void main(String[] args) {
        Calculations ob=new Calculations();
        ob.info();
        Circle c1=new Circle();
        Square s1=new Square();
        c1.circleArea(10);
        s1.squareArea(10);
    }
}
