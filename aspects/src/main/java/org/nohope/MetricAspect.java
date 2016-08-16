package org.nohope;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

/**
 */
@Aspect
public class MetricAspect {
    @Autowired
    private Ticker ticker;

    @Pointcut("@annotation(org.nohope.Timer)")
    public void timerPointcut() {}

    @Around("timerPointcut() ")
    public Object measure(ProceedingJoinPoint joinPoint) throws Throwable {
        final Stopwatch timer = Stopwatch.createStarted(ticker);
        final Object result = joinPoint.proceed();
        System.err.println("Execution took " + timer.elapsed(TimeUnit.MILLISECONDS) + "ms");
        return result;
    }
}
