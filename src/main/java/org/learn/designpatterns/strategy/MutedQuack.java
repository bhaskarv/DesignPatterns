package org.learn.designpatterns.strategy;

public class MutedQuack implements QuackBehavior {

	public void quack() {
		System.out.println(" <<SLIENCE>>");
	}

}
