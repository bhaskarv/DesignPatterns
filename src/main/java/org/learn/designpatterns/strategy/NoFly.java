package org.learn.designpatterns.strategy;

public class NoFly implements FlyBehavior {

        @Override
	public void fly() {
		System.out.println(" I CAN'T FLY ");
	}

}
