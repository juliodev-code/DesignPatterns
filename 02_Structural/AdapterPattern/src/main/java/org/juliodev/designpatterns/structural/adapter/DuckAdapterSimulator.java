package org.juliodev.designpatterns.structural.adapter;

import org.juliodev.designpatterns.structural.adapter.adaptee.Turkey;
import org.juliodev.designpatterns.structural.adapter.adaptee.WildTurkey;
import org.juliodev.designpatterns.structural.adapter.adapters.TurkeyAdapter;
import org.juliodev.designpatterns.structural.adapter.client.Duck;
import org.juliodev.designpatterns.structural.adapter.client.MallardDuck;

public class DuckAdapterSimulator {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        System.out.println("The Duck says...");
        testDuck(duck);

        WildTurkey turkey = new WildTurkey();
        System.out.println("\nThe Turkey says...");
        turkey.gobble();
        turkey.fly();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
