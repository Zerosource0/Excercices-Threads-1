/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercices.threads.pkg1;

/**
 *
 * @author marcj_000
 */
public class ExcercicesThreads1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       Task1 t1 = new Task1();
       Task2 t2 = new Task2();
       Task3 t3 = new Task3();
       
       t1.start();
       t2.start();
       t3.start();
       Thread.sleep(10000);
       t3.setStop(true);
    }
    
}
