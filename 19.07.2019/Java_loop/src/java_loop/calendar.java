
package java_loop;

import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        int a;
        System.out.printf("Enter no of month:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a==1)
            System.out.printf("31 days");
        else if(a==2)
            System.out.printf("28 days");
        else if(a==3)
            System.out.printf("31 days");
        else if(a==4)
            System.out.printf("30 days");
        else if(a==5)
            System.out.printf("31 days");
        else if(a==6)
            System.out.printf("30 days");
        else if(a==7)
            System.out.printf("31 days");
        else if(a==8)
            System.out.printf("31 days");
        else if(a==9)
            System.out.printf("30 days");
        else if(a==10)
            System.out.printf("31 days");
        else if(a==11)
            System.out.printf("30 days");
        else if(a==12)
            System.out.printf("31 days");
        else
            System.out.printf("Invalid month");
    }
 
}
