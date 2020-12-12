package exercises3sda_11_13;

public class Rectangle implements Figure{
    private Double height;
    private Double width;
    public Rectangle(Double height,Double width){
        this.height=height;
        this.width=width;
    }
    @Override
    public Double getArea(){
        return this.width*this.height;
    }
}
