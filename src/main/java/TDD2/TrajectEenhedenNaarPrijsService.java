package TDD2;

public class TrajectEenhedenNaarPrijsService implements TrajectEenhedenNaarPrijs {


    public int getPriceTrajectEenheden(int aantalTrajectEenheden) {
        return aantalTrajectEenheden * 2;
    }
}
