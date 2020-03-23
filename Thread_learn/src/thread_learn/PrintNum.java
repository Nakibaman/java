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
public class PrintNum implements Runnable{
    private int lastNum;
    public PrintNum(int i)
    {
        lastNum=i;
    }
    @Override
    public void run() {
        for(int i=1;i<=lastNum;i++)
            System.out.print(i);
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
