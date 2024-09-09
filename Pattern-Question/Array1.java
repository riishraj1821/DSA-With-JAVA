
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //declaration on array
        // datatype[] variable name = new datatpe[];

        // int[] rollno = new int[5];
        //or directly
        // int[] rollno1 =  {1,2,3,4,5};

       int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(arr ));
        

    }
}
