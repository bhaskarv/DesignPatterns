package org.learn.designpatterns.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck duck = new ModelDuck();

        duck.display();
        duck.performFly();
        duck.performQuack();

        //Change ModelDuck's fly behavior dynamically.
        duck.setFlyBehavior(new FlyWithRocket());
        duck.performFly();
        
        duck.setFlyBehavior(new NoFly());
        duck.performFly();
    }
}
