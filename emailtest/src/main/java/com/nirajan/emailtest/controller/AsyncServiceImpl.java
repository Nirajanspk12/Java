package com.nirajan.emailtest.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.InterruptedIOException;

@Service
public class AsyncServiceImpl implements AsyncService {
    @Override
    @Async
    public String dosomething() throws InterruptedException {
        interrupt();
        return "sucessfully";

    }

    @Async
    private void interrupt() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Thread woke up");
    }

}
