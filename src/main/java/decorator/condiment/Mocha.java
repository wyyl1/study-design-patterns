package decorator.condiment;

import decorator.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "摩卡";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
