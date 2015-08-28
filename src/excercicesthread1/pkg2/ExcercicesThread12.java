/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercicesthread1.pkg2;

/**
 *
 * @author marcj_000
 */
public class ExcercicesThread12 {

    
    public static void main(String[] args) throws InterruptedException {
        Even instanceOfEven = new Even();
        
        MyThread1 t1 = new MyThread1(instanceOfEven);
        MyThread2 t2 = new MyThread2(instanceOfEven);
        
        t1.start();
        t1.join();
        t2.start();
    }
    
}
