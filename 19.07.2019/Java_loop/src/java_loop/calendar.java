
package java_loop;

import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        String a;
        System.out.printf("Enter no of month:");
        Scanner sc=new Scanner(System.in);
        a=sc.next();
        if(a.equals("january"))
            System.out.printf("31 days");
        else if(a.equals("february"))
            System.out.printf("28 days");
        else if(a.equals("march"))
            System.out.printf("31 days");
        else if(a.equals("april"))
            System.out.printf("30 days");
        else if(a.equals("may"))
            System.out.printf("31 days");
        else if(a.equals("june"))
            System.out.printf("30 days");
        else if(a.equals("july"))
            System.out.printf("31 days");
        else if(a.equals("august"))
            System.out.printf("31 days");
        else if(a.equals("september"))
            System.out.printf("30 days");
        else if(a.equals("october"))
            System.out.printf("31 days");
        else if(a.equals("november"))
            System.out.printf("30 days");
        else if(a.equals("december"))
            System.out.printf("31 days");
        else
            System.out.printf("Invalid month");
    }
 
}
