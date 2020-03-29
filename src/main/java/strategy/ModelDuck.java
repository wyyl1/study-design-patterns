package strategy;

import strategy.fly.FlyNoWay;

public class ModelDuck extends Duck {

	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
