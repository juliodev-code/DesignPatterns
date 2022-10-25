package org.juliodev.designpatterns.structural.adapter;

import org.juliodev.designpatterns.structural.adapter.adaptee.Turkey;
import org.juliodev.designpatterns.structural.adapter.adapters.DuckAdapter;
import org.juliodev.designpatterns.structural.adapter.client.MallardDuck;

public class TurkeyAdapterSimulator {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for(int i = 0; i < 10; i++) {
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
