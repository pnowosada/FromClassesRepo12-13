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
    }
}
