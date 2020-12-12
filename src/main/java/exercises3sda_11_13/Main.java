package exercises3sda_11_13;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        System.out.println("Pole koła:"+circle.getArea());
        Rectangle rectangle =new Rectangle(1.1,3.1);
        System.out.println("Pole prostokąta:"+rectangle.getArea());
        Triangle triangle=new Triangle(1.1,1.3);
        System.out.println("Pole trójkąta:"+triangle.getArea());

    }
}
