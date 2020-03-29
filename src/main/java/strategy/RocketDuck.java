package strategy;

import strategy.fly.FlyRocketPowered;

public class RocketDuck extends Duck {

	public RocketDuck() {
		setFlyBehavior(new FlyRocketPowered());
	}

	public void display() {
		System.out.println("I'm a rocket duck");
	}
}
