/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercicesthread1.pkg2;

public class MyThread1 extends Thread {
    
    Even even;

    public MyThread1(Even even) {
        this.even = even;
    }
    
    @Override
    public void run(){
        System.out.println(even.next());
    }
    
}
