/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinc1000;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author perilli.alberto
 */
public class Inc1000 extends Thread{
    public static int cont;
    
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            inc1();
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Inc1000.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public synchronized void inc1(){
        cont++;
    }
}
