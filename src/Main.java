import java.util.Arrays;

public class Main {
    public  static void main(String[] args){
     int[] numberss = {2,3,4,5,6,7};
        Arrays.sort(numberss);
        String results = Arrays.toString(numberss);
        System.out.println(results);

        // Anotehr
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=2;
        String result =  Arrays.toString(numbers);
        System.out.println(result);
    }
}


