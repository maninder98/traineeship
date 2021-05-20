package h7.Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Rekening> rekeningen = new ArrayList<Rekening>();


    public Bank() {

    }

    public void rekeningToevoegen(Rekening rekening) {
        this.rekeningen.add(rekening);
    }

    public void geldOvermaken(Rekening van, Rekening naar, double bedrag) {
        if (van.geldOpnemen(bedrag) > 0) {
            naar.geldStorten(bedrag);
        }
    }

    public void lijstVanRekeningen() {
        for (int i = 0; i < rekeningen.size(); i++) {
            System.out.println(rekeningen.get(i));
        }
        System.out.println("Totaal geld in bank is: " + getTotal());

    }

    public double getTotal() {
        double totaal = 0;
        for (Rekening rekening : rekeningen) {
            totaal += rekening.getSaldo();
        }
        return totaal;
    }


}
