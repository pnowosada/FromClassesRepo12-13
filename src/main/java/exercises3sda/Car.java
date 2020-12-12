package exercises3sda;

public class Car implements Movable{
        @Override
        public String move() {
            System.out.println("Jadę ale jakby wcześniej");
            return "Jadę";
        }
}
