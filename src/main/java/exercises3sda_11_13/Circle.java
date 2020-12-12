package exercises3sda_11_13;

public class Circle implements Figure{
    private Integer radius;
    public Circle(Integer radius){
        this.radius=radius;
    }
    @Override
    public Double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

}
