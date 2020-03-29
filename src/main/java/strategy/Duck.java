package strategy;

import strategy.fly.FlyBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    public Duck() {
    }

    protected void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();
}
