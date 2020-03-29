package strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();

        Duck rocket = new RocketDuck();
        rocket.performFly();
    }
}
