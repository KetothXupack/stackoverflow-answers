package org.nohope;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OperationsPerInvocation;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.concurrent.TimeUnit;

/**
 */
@BenchmarkMode({Mode.Throughput, Mode.AverageTime})
public class ExampleBenchmark {
    private static final int SIZE = 1000 * 1000 * 10;

    @State(Scope.Benchmark)
    public static class BenchmarkState {
        Example example = new Example(100);
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    @OperationsPerInvocation(SIZE)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void doSomethingTest(final BenchmarkState state) {
        //noinspection Convert2streamapi
        for (int i = 0; i < SIZE; i++) {
            state.example.doSomething(i);
        }
    }
}
