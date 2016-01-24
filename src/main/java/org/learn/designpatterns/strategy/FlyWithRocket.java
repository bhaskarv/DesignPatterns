package org.learn.designpatterns.strategy;

public class FlyWithRocket implements FlyBehavior {

        @Override
	public void fly() {
		System.out.println(" I AM FLYING WITH A ROCKET ");
	}

}
