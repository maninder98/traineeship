package Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RekeningTest {

    private Bank bank;
    private Rekening rekening1;
    private Rekening rekening2;


    @BeforeEach
    void setUp() {
      bank = new Bank();
      rekening1 = new Rekening("NL12ABNA239230958209", 0,2);
      rekening2 = new Rekening("NL12ABNA23570958209", 0,3);

          bank.rekeningToevoegen(rekening1);
          bank.rekeningToevoegen(rekening2);

    }

    @Test
    public void testBankApplicatie(){
        rekening1.geldStorten(15000);
        assertEquals(15000.0, rekening1.getSaldo());

        rekening2.geldStorten(2000);
        assertTrue(rekening2.getSaldo() == 2000.0);

        //saldo voor overboeking
        bank.lijstVanRekeningen();

        bank.geldOvermaken(rekening1, rekening2, 2000);

        //saldo na overboeking
        bank.lijstVanRekeningen();
        assertEquals(13000.0, rekening1.getSaldo());
        assertEquals(4000.0, rekening2.getSaldo());

        //totaal geld in bank
        assertEquals(17000.0, bank.getTotal());

        //geldopnemen van rekening1
        rekening1.geldOpnemen(1000.0);
        assertEquals(12000, rekening1.getSaldo());

        //rente testen
        rekening2.setRentePercentage(3);
        double rente = rekening2.renteBerekenen(1);
        assertEquals(4120.0, rente);

    }



}