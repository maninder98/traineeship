package h5;

import java.util.ArrayList;
import java.util.Collections;

public class Methods {

    //retuns the greatest value
    public int greatest(int a, int b) {
        return Math.max(a, b);
    }

    public String greatest(String a, String b) {
        String longestString = " ";
        if (a.length() < b.length()) {
            longestString = b;
        } else {
            longestString = a;
        }
        return longestString;

    }

    public int greatest(ArrayList<Integer> list) {

        int biggestNumber = Collections.max(list);

        return biggestNumber;

    }

}
