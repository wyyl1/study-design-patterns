package decorator.condiment;

import decorator.Beverage;
import decorator.condiment.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 牛奶 ";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
