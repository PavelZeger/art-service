package com.artservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 02/07/2021
 */
@Configuration
public class AsyncConfig {

    public static final String ASYNC = "async";

    @Value("${async.core.pool.size}")
    private int asyncCorePoolSize;

    @Value("${async.max.pool.size}")
    private int asyncMaxPoolSize;

    @Value("${async.queue.capacity}")
    private int asyncQueueCapacity;

    @Bean(name = ASYNC)
    public Executor threadPoolTaskExecutor() {
        var executor = getThreaPoolTaskExecutor(asyncCorePoolSize, asyncMaxPoolSize, "async-");
        executor.setQueueCapacity(asyncQueueCapacity);
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.initialize();
        return executor;
    }

    private ThreadPoolTaskExecutor getThreaPoolTaskExecutor(int corePoolSize, int maxPoolSize, String prefix) {
        var threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(corePoolSize);
        threadPoolTaskExecutor.setMaxPoolSize(maxPoolSize);
        threadPoolTaskExecutor.setThreadNamePrefix(prefix);
        return threadPoolTaskExecutor;
    }

}
