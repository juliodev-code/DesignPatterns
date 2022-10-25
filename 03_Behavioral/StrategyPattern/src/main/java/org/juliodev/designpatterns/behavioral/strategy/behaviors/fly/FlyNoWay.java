package org.juliodev.designpatterns.behavioral.strategy.behaviors.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
