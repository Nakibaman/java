/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_learn;

/**
 *
 * @author Walton
 */
public class Thread_learn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Runnable taskA=new PrintChar('a', 200);
       Runnable taskB=new PrintChar('b', 200);
       Runnable taskC=new PrintNum(3000);
       
       Thread t1=new Thread(taskA);
       Thread t2=new Thread(taskB);
       Thread t3=new Thread(taskC);
       
       t1.start();
       t2.start();
       t3.start();
    }
    
}
