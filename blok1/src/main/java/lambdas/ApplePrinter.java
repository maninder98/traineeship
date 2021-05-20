package lambdas;

public class ApplePrinter implements Consumer {
    @Override
    public void accept(Apple apple) {
        System.out.println(apple);
    }
}
