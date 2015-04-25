package com.gu.test.springmvc.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.gu.test.springmvc.service.base.TestBaseService;

/**
 * <p>ThreadPoolTaskExecutor 测试</p>
 * @author  bobogu
 * @version $Id: ThreadPoolTaskExecutorTest.java, v 0.1 2015年4月17日 下午5:32:42 gushunbin Exp $
 */

public class ThreadPoolTaskExecutorTest extends TestBaseService {
    @Resource(name = "taskExecutor")
    private ThreadPoolTaskExecutor taskExecutor;

    @Test
    public void testThreadPoolTaskExecutor() {
        taskExecutor.execute(new Runnable() {
            public void run() {
                try {
                    System.err.println("current thread name:" + Thread.currentThread().getName());
                    Thread.currentThread().sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        int activeCount = taskExecutor.getActiveCount();
        System.err.println("[x] - now threadpool active threads totalNum : " + activeCount);
    }
}
