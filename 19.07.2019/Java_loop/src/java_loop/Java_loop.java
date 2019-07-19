
package java_loop;

import java.util.Scanner;

public class Java_loop {

    public static void main(String[] args) {
        int a,b;
        System.out.printf("Enter a number:");
        Scanner o=new Scanner(System.in);
        a=o.nextInt();
        System.out.printf("Enter another number:");
        b=o.nextInt();
        if(a>b)
            System.out.printf("A is bigger");
        else
            System.out.printf("B is bigger");
    }
    
}
