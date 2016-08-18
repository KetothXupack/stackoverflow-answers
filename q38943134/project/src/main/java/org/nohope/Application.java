package org.nohope;

import com.google.common.base.Ticker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 */
@Import(TimerConfiguration.class)
@SpringBootApplication
public class Application {
    @Bean
    public Ticker ticker() {
        return Ticker.systemTicker();
    }

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        ctx.getBean(MyService.class).doWork();
    }
}
