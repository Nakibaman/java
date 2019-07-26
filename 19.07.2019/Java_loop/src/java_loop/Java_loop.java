
package java_loop;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Java_loop {

    public static void main(String[] args) {
        int a,b;
        char c;
        System.out.printf("Enter a number:");
        Scanner o=new Scanner(System.in);
        c=o.next().charAt(0);
        System.out.printf("Enter another number:");
        b=o.next;
        
        if(a==b)
            System.out.printf("A and B are equal");
        else if(a>b)
            System.out.printf("A is bigger");
        else
            System.out.printf("B is bigger");
    }
    
}
