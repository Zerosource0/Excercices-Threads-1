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
public class Task3 extends Thread{
        
    public volatile boolean finished = false;
    
    public boolean stop = false;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    private long iterations = 10000000;

    @Override
    public void run() {

        try {
            for (long i = 11; i < iterations; i++) {
                System.out.println("This is Thread3 for the " + (i) + ". time");
                sleep(3000);
                if(stop) break;
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

    }
    
    
}
