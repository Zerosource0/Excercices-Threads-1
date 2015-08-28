/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockingguithread;

import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

class Worker extends SwingWorker<Integer, Integer>
{
    protected Integer doInBackground() throws Exception
    {
        // Do a time-consuming task.
        Thread.sleep(1000);
        return 42;
    }

    protected void done()
    {
        try
        {
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}