package org.learn.designpatterns.strategy;

public class Quack implements QuackBehavior {

        @Override
	public void quack() {
		System.out.println(" QUACK ");
	}

}
