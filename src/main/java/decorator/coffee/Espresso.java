package decorator.coffee;

import decorator.Beverage;

public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "意式浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
