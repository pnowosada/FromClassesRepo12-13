package exercises3sda_11_13;

public class Triangle implements Figure{
    private Double height;
    private Double width;
    public Triangle(Double height,Double width){
        this.height=height;
        this.width=width;
    }
    @Override
    public Double getArea(){
        return this.height*this.width*0.5;
    }
}
