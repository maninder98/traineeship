package main.h3;

public class IncrementDecrement {

    public static void main(String[] args) {

        //Hoofdstuk 3

        int age = 18;
        age =age+1;
        age+=1;
        age++;
        ++age;

        // dit is voorbeeld van ++i
        int incrementedAge= ++age;
        System.out.println(incrementedAge);

        // dit is voorbeeld van i++
        int incrementedAge2= age++;
        System.out.println(incrementedAge2);

        //3.2
        /* 3 = 0011, 1 postite naar rechts is: 0010, 0010 is 2
           4 = 0100, 1 positie naar rechts is: 0010,
           5 = 0101, 1 positie naar rechts is: 0011,
           6 = 0110, 1 positie naar rechts is: 0011, 0011
           7 = 0111, 1 positie naar rechts is: 0111, 0011 0100
        * */

        int i = 7;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        System.out.println(j);

        // 1 = 0001
        //  0010
        // 0011
        // 0100
        //0101

        //3.3
        System.out.println("binary sum of 1010 +100:  ");
        System.out.print(Integer.toBinaryString(1010) + Integer.toBinaryString(100));

        // TODO 3.4

        //TODO 3.5

        // TODO 3.6



    }




}

