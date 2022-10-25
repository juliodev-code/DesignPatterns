package org.juliodev.designpatterns.behavioral.strategy;

import org.juliodev.designpatterns.behavioral.strategy.superclass.Duck;
import org.juliodev.designpatterns.behavioral.strategy.behaviors.fly.FlyNoWay;
import org.juliodev.designpatterns.behavioral.strategy.behaviors.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display(){
        System.out.println("I am a decoy duck");
    }
}
