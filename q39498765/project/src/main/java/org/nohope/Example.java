package org.nohope;

/**
 */
public final class Example {

    private Example() {
    }

    public static void main(String[] args) {
        System.err.println(InstrumentationAgent.findSizeOfObject("Hello world!"));
    }
}
