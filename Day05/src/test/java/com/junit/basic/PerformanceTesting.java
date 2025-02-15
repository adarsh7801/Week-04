//package
package com.junit.basic;

//import
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

//testing class
public class PerformanceTesting {

    //testing method giving time 2 seconds
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void longRunningTaskTesting(){

        assertTrue(Performance.longRunningTask(100000));

    }

}
