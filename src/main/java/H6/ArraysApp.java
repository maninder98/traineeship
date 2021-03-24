package H6;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {


        long[] row = new long[4]; //[0, 0, 0, 0] je maakt een array van 4 lang. Het begint van 0 tot en met 3.
        row[2] = 3; //[0, 0, 3, 0] je geeft de 3e vak in de array de waarde 3.
        long[] copy = row; //[0, 0, 3, 0] copy is referrence naar row
        copy[2]++; //[0, 0, 4, 0] je verhoogd de 3e vak van de array met 1.

        System.out.println(row[2]);
        System.out.println(copy[2]);
        System.out.println(row[3]);

        longArray();


        long[] multiplierArray = new long[]{1, 2, 3, 4};

        multiplier(multiplierArray, 3);
        System.out.println(Arrays.toString(multiplierArray));
    }

    public static void longArray() {
        //array literal
        long[] array = new long[]{1, 2, 3, 4};

        int newLength = array.length * 2;


      long[] newArray = Arrays.copyOf(array, array.length*2);
        System.out.println(newArray.length);

        //print de waaardes van nieuwe array uit
        System.out.println(Arrays.toString(newArray));

    }

    public static void multiplier(long[] multiplyArray, int multiplier){

        for (int i = 0; i < multiplyArray.length; i++) {
            multiplyArray[i] =  multiplyArray[i] * multiplier;
        }

    }


}
