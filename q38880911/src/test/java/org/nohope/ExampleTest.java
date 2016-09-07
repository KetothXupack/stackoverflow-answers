package org.nohope;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 */
public class ExampleTest {
    @Test
    public void doSomethingTest() {
        final Example example = new Example(100);
        assertEquals(301989888, example.doSomething(2009));
    }
}
