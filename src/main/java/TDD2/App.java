package TDD2;



public class App {

  //  private Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        new App().startUp();
    }

    private void startUp() {
        int trajectPrijs = new TrajectPrijsService().getTrajectPrijs("Ut", "Am");
        System.out.println(trajectPrijs);
    }



    }
