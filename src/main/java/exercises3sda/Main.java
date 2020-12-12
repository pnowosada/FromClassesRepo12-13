package exercises3sda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1= new Cat("KICIA");
        Cat cat2= new Cat("KOCUR");
        Cat cat3= new Cat("KMICIC");
        List<Cat> cats= new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        for (Cat cat: cats){
            cat.makeSound();
        }
        cat1.eatMouse();
        cat2.eatMouse();
        cat3.eatMouse();

        Dog dog1= new Dog("Pimpek");
        Dog dog2= new Dog("Azor");
        Dog dog3= new Dog("Reks");

        dog1.makeSound();
        dog2.makeSound();
        dog3.makeSound();

        System.out.println("Exercise 5 \n");
        List<Animals>animals=new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);
        animals.add(cat2);
        animals.add(dog2);
        for(Animals animal :animals){
            animal.makeSound();
        }
    }
}
