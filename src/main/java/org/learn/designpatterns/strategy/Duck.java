package org.learn.designpatterns.strategy;

public abstract class Duck {
	
	//Encapsulate family of algorithms that vary frequently
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	//These swim and display does not change frequently
	public void swim() {
		System.out.println(" I AM SWIMMING ");
	}
	public abstract void display();

	//Delegate to the concrete fly behavior at runtime.
	public void performFly() {
		flyBehavior.fly();
	}
	
	//Delegate to concreate quack behavior at runtime.
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
