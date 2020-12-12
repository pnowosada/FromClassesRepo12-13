package exercises3sda;

public class Vet {
    public void sayHello(Cat someCat){
        System.out.println("Witaj kocie " + someCat.getName());
    }

    public void sayHello(Dog someDog){
        System.out.println("Witaj piesku " + someDog.getName());
    }

    public void universalSayHello (AbstractAnimal animal){
        System.out.println("Witaj " + animal.getName());
    }
}
