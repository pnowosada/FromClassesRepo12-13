package exercises3sda;

public class Dog implements Animals{
    private String name;

    public Dog(String name){
        this.name=name;
    }
    @Override
    public void makeSound(){
        System.out.println(name + "woff woff " );
    }
}
