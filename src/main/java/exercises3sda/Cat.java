package exercises3sda;

import lombok.Getter;
import lombok.Setter;

import javax.print.DocFlavor;

public class Cat implements Animals{

    private String name;
    private Integer mouseCounter;

    public Cat(String name) {
        this.name = name;
        this.mouseCounter = 0;
    }

    public Cat(String name, Integer mouseCounter) {
        this.mouseCounter = mouseCounter;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setMouseCounter(Integer mouseCounter){
        this.mouseCounter=mouseCounter;
    }
    public Integer getMouseCounter(){
        return this.mouseCounter;
    }
    @Override
    public void makeSound() {
        System.out.println(this.name + " goes meow!!!");
    }

    public void eatMouse() {
        this.mouseCounter++;
        //this.mouseCounter= this.mouseCounter +1 ; to jest to samo
        System.out.println("Zjadłem myszy " + mouseCounter + " myszy");
    }


}
