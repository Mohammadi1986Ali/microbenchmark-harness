package com.javalab.tutorial.utility;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class BenchmarkCase {

    private static final Logger LOGGER = LoggerFactory.getLogger(BenchmarkCase.class);

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    @Measurement(iterations = 1)
    @Warmup(iterations = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void doNothing() {
        LOGGER.info("BenchmarkCase#doNothing");
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    @Measurement(iterations = 1)
    @Warmup(iterations = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void objectCreation() {
        LOGGER.info("BenchmarkCase#objectCreation");
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    @Measurement(iterations = 1)
    @Warmup(iterations = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public Object returnObject() {
        LOGGER.info("BenchmarkCase#returnObject");
        return new Object();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    @Measurement(iterations = 1)
    @Warmup(iterations = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void blackHole(Blackhole blackhole) {
        LOGGER.info("BenchmarkCase#blackHole");
        blackhole.consume(new Object());
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    @Measurement(iterations = 1)
    @Warmup(iterations = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public double foldedLog() {
        LOGGER.info("BenchmarkCase#foldedLog");

        int x = 10;
        return Math.log(x);
    }

    @State(Scope.Benchmark)
    public static class Log {
        public int x = 10;
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    @Measurement(iterations = 1)
    @Warmup(iterations = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public double log(Log input) {
        LOGGER.info("BenchmarkCase#log");
        return Math.log(input.x);
    }
}
