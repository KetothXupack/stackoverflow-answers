package org.nohope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 */
@Configuration
@EnableAspectJAutoProxy
public class TimerConfiguration {

    @Bean
    public MetricAspect notifyAspect() {
        return new MetricAspect();
    }
}
