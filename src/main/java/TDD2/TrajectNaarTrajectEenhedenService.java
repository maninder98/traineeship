package TDD2;

import java.util.Random;

public class TrajectNaarTrajectEenhedenService {


    public int getTrajectEenheden(String from, String to) {
        int random =  new Random().nextInt(10);
        System.out.println(random);
        return random;
    }
}
