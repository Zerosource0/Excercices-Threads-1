/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercices.threads.pkg1;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcj_000
 */
public class Task1 extends Thread {
    
    public volatile boolean finished = false;

    private long iterations = 1000000000;

    @Override
    public void run() {

        long sum = 0;
        for (long i = 0; i < iterations; i++) {
            sum = sum+i;
            
        }
        System.out.println("Thread 1:" + sum);
    }
    
}
