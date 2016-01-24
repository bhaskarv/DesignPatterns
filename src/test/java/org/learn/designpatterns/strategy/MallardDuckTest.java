package org.learn.designpatterns.strategy;

import static junit.framework.Assert.assertNotNull;

import org.junit.Test;

public class MallardDuckTest {

    Duck duck = new MallardDuck();

    @Test
    public void testPerformFly() {
        assertNotNull(duck.flyBehavior);
        assertNotNull(duck.quackBehavior);
        duck.performFly();
        duck.performQuack();
    }

}
