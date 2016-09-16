package org.nohope;

import java.lang.instrument.Instrumentation;

/**
 */
public final class InstrumentationAgent {
    private static volatile Instrumentation instrumentation;

    private InstrumentationAgent() {
    }

    public static void premain(String agentArgs, Instrumentation instObj) {
        // instObj is handle passed by JVM
        instrumentation = instObj;
    }

    public static long findSizeOfObject(Object obj) {
        // use instrumentation to find size of object obj
        if (instrumentation == null) {
            throw new IllegalStateException("Agent not initted");
        } else {
            return instrumentation.getObjectSize(obj);
        }
    }
}
