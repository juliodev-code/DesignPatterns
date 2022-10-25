package org.juliodev.designpatterns.behavioral.strategy.behaviors.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying!!");
    }
}
