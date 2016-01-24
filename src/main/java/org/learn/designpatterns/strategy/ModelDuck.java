package org.learn.designpatterns.strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println(" I AM A MODEL DUCK ");
    }

}
