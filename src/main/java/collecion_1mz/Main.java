package collecion_1mz;

public class Main {
    public static void main(String[] args) {
        Ex1_1mz myArray=new Ex1_1mz(25);
        myArray.addToArray();
        myArray.printArray();
        System.out.println(myArray.getArraySize());
        myArray.printArraySize();
        myArray.multiplication(10);
        System.out.println();
        myArray.printArray();
    }
}
