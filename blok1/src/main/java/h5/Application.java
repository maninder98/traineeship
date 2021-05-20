package h5;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Methods methods = new Methods();
        int greatestNumber = methods.greatest(30, 50);
        System.out.println(" The greatest number is: " + greatestNumber);

        // dmv aanroepen van methode:
        String result = methods.greatest("ab43905734957fhisocd", "abcdeee");
        System.out.println(" The longest string is: " + result);


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(45);
        int greatestValue = methods.greatest(arrayList);
        System.out.println("The greatest value is: " + greatestValue);


    }
}
