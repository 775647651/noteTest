package com.succ.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
    }

}
