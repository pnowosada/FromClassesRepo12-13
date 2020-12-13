package collecion_1mz;

public class Ex1_1mz {
    private int[] numbers;
    public Ex1_1mz(){
        numbers= new int[10];
    }
    public Ex1_1mz(int size){
        numbers=new int[size];
    }
    public int[] addToArray(){
        for(int i=1;i<=numbers.length;i++){
            numbers[i-1]=i;
        }
        return numbers;
    }
    public void printArray(){
        for(int element:numbers){
            System.out.print(element+" ");
        }
    }
    public void printArraySize(){
        System.out.println("The array size is: "+numbers.length);
    }
    public int getArraySize(){
        return numbers.length;
    }
    public int[] multiplication(int mul){
        for(int i=0;i<numbers.length;i++){
            numbers[i]*=mul;
        }
        return numbers;
    }


}
