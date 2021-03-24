package TDD2;

public class TrajectPrijsService {


    private TrajectNaarTrajectEenhedenService trajectNaarTrajectEenjedenService = new TrajectNaarTrajectEenhedenService();
    private TrajectEenhedenNaarPrijsService trajectEenhedenNaarPrijsService = new TrajectEenhedenNaarPrijsService();

    public int getTrajectPrijs(String from, String to) {

        int eenheden = trajectNaarTrajectEenjedenService.getTrajectEenheden(from, to);
        int price = trajectEenhedenNaarPrijsService.getPriceTrajectEenheden(eenheden);
        return eenheden * price;
    }

}
