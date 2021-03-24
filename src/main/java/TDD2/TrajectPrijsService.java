package TDD2;

public class TrajectPrijsService {


    private TrajectNaarTrajectEenheden trajectNaarTrajectEenjeden = new TrajectNaarTrajectEenhedenService();
    private TrajectEenhedenNaarPrijs trajectEenhedenNaarPrijs = new TrajectEenhedenNaarPrijsService();

    public int getTrajectPrijs(String from, String to) {

        int eenheden = trajectNaarTrajectEenjeden.getTrajectEenheden(from, to);
        int price = trajectEenhedenNaarPrijs.getPriceTrajectEenheden(eenheden);
        return eenheden * price;
    }

}
