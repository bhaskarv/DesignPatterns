package org.learn.designpatterns.strategy;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println(" I AM FLYING WITH WINGS");
    }

}
