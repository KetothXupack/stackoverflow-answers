package org.nohope;

import com.google.common.base.Ticker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 */
public class TimerConfigurationTest {
    public static class MyBean {
        @Timer
        public void test() throws InterruptedException {
            TimeUnit.SECONDS.sleep(5);
        }
    }

    @Configuration
    @Import(TimerConfiguration.class)
    public static class MyConfiguration {
        @Bean
        public Ticker ticker() {
            return Ticker.systemTicker();
        }

        @Bean
        public MyBean myBean() {
            return new MyBean();
        }
    }

    @Test
    public void testAspectWorks() throws InterruptedException {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(MyConfiguration.class);
        final MyBean bean = ctx.getBean(MyBean.class);
        bean.test();
    }
}
