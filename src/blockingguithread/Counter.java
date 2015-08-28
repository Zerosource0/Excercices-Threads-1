/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockingguithread;

import javax.swing.JLabel;

/**
 *
 * @author marcj_000
 */
public class Counter implements Runnable {
    
    public String count;
    private javax.swing.JLabel jLabel1;

    public Counter(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }
    
    
    public String getCount() {
        return count;
    }
    
    @Override
    public void run(){
    for (int i = 20; i >= 0; i--) {
            count = ("Remains: " + i);
            jLabel1.setText(count);
            System.out.println("im running bitch");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    
}
