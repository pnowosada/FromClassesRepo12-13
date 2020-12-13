package exercises3sda_11_13;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        System.out.println("Pole koła:"+circle.getArea());
        Rectangle rectangle =new Rectangle(1.1,3.1);
        System.out.println("Pole prostokąta:"+rectangle.getArea());
        Triangle triangle=new Triangle(1.1,1.3);
        System.out.println("Pole trójkąta:"+triangle.getArea());

        List<Figure>figures=new LinkedList<>();
        figures.add(rectangle);
        figures.add(circle);
        figures.add(triangle);

        double result=AreaCounter.countArea(figures);
        System.out.println(result);

        double area=300.0;
        boolean isEnough= AreaCounter.checkArea(area,figures);
        System.out.println("Feedback if the amount "+isEnough);

    }
}
