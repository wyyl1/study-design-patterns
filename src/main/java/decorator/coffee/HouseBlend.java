package decorator.coffee;

import decorator.Beverage;

public class HouseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "混合咖啡";
    }

    @Override
    public double cost() {
        return .89;
    }
}
