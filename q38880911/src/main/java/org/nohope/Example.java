package org.nohope;

/**
 */
public class Example {
    private final int j;

    public Example(final int j) {
        this.j = j;
    }

    public int doSomething(int i) {
        return i % j << i;
    }
}
