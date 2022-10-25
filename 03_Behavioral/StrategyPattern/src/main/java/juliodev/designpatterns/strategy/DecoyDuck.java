package juliodev.designpatterns.strategy;

import juliodev.designpatterns.strategy.behaviors.fly.FlyNoWay;
import juliodev.designpatterns.strategy.behaviors.quack.MuteQuack;
import juliodev.designpatterns.strategy.superclass.Duck;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display(){
        System.out.println("I am a decoy duck");
    }
}
