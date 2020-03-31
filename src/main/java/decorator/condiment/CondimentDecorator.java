package decorator.condiment;

import decorator.Beverage;

/**
 * 调味品
 */
public abstract class CondimentDecorator implements Beverage {

    protected Beverage beverage;
}
