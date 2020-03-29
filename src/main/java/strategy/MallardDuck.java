package strategy;

import strategy.fly.FlyWithWings;

public class MallardDuck extends Duck {

	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
