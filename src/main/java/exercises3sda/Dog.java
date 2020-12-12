package exercises3sda;

public class Dog extends AbstractAnimal implements Animals{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " woff woff");
    }
}
