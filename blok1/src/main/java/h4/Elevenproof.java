package h4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Elevenproof {

    //getting the accountnumber from user
    Scanner scanner = new Scanner(System.in);

    public void getUserInput() {
        try {
            System.out.println("Enter your accountnumber: ");
            String accountnumber = scanner.nextLine();
            List<Integer> sums = new ArrayList<Integer>();

            int multiplier = accountnumber.length();

            if (accountnumber.matches("[0-9]+")) {
                for (int i = 0; i < accountnumber.length(); i++) {
                    int sum = Integer.parseInt(accountnumber.substring(i, i + 1)) * multiplier;
                    sums.add(sum);
                    multiplier--;
                }

                int totaal = 0;
                for (int i = 0; i < sums.size(); i++) {
                    totaal += sums.get(i);
                }
                System.out.println(totaal);
                if (totaal % 11 == 0) {
                    System.out.println("Dit is de juiste rekeningsnummer");
                } else {
                    throw new IllegalArgumentException("De rekeningnummer klopt niet");
                }
            } else {
                throw new InputMismatchException("De invoer klopt niet");

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }


}
