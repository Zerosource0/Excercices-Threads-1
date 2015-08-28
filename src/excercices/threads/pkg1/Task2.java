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
public class Task2 extends Thread{
    
    public volatile boolean finished = false;

    private int iterations = 5;

    @Override
    public void run() {

        try {
            for (int i = 0; i < iterations; i++) {
                System.out.println("This is Thread2 for the " + (i+1) + ". time");
                sleep(2000);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

    }
    
}
