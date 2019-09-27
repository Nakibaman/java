/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_demo;

/**
 *
 * @author nakibamanturzo
 */
public class A {
    int a,b;
    public void getab(int x,int y)
    {
        a=x;
        b=y;
    }
    public int plus()
    {
        return a+b;
    }
    public int minus()
    {
        return a-b;
    }
    public double div()
    {
        return a/b;
    }
}
