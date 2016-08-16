package org.nohope;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 */
@Service
public class MyService {
    @Timer
    public void doWork() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
    }
}
