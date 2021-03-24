package h7.Bank;

public class Rekening {

    private String nummer;
    private double saldo;
    private double rentePercentage;

    public Rekening(String nummer, double saldo, double rentePercentage) {
        this.nummer = nummer;
        this.saldo = saldo;
        this.rentePercentage = rentePercentage;
    }


    public double geldStorten(double bedrag) {
        saldo += bedrag;
        return saldo;
    }

    public double geldOpnemen(double bedrag) {
        if (saldo > 0) {
            this.saldo -= bedrag;
            return saldo;
        }else
        return 0;
    }

    public double renteBerekenen(int jaren) {
        return saldo * Math.pow(1 + rentePercentage / 100, jaren);
    }


    public double getSaldo() {
        return saldo;
    }

    public void setRentePercentage(double rentePercentage) {
        this.rentePercentage = rentePercentage;
    }
}
