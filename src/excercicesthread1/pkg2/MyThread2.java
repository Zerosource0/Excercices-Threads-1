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
public class MyThread2 extends Thread {
    
    Even even;

    public MyThread2(Even even) {
        this.even = even;
    }
    
    @Override
    public void run(){
        System.out.println(even.next());
    }
    
}
