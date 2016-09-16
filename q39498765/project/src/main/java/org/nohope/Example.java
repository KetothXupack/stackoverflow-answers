package org.nohope;

/**
 */
public final class Example {

    private Example() {
    }

    public static void main(String[] args) {
        final String string = "Hello world!";
        System.err.println('"' + string + "\" size is equal to " + InstrumentationAgent.findSizeOfObject(string));
    }
}
