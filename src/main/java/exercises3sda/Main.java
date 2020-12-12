package exercises3sda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kazimierz");
        Cat cat2 = new Cat("Mruczek");
        Cat cat3 = new Cat("Garfield");
        cat1.makeSound();
        cat2.makeSound();
        cat3.makeSound();
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        for (Cat cat : cats) {
            cat.makeSound();
        }
        cat1.eatMouse();
        cat1.eatMouse();
        cat1.eatMouse();

        Dog dog1 = new Dog("Burek");
        Dog dog2 = new Dog("Azor");
        Dog dog3 = new Dog("Reks");

        dog1.makeSound();
        dog2.makeSound();
        dog3.makeSound();

        System.out.println("Ex 5");

        List<Animals> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);

        for (Animals animal : animals) {
            animal.makeSound();
        }

        System.out.println("Exercise 6");
        Car car1 = new Car();
        car1.move();

        System.out.println("Exercise 7");
        System.out.println(cat1.move());
        System.out.println(cat1);

        System.out.println("Exercise 8");
        Vet someVet = new Vet();
        someVet.sayHello(cat2);
        someVet.sayHello(dog3);

        System.out.println("Exercise 10");
        someVet.universalSayHello(cat1);
        someVet.universalSayHello(dog2);

    }
}


