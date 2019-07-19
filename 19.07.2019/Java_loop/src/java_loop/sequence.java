
package java_loop;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        int a,b,c;
        System.out.printf("Enter a,b and c:");
        Scanner d=new Scanner(System.in);
        a=d.nextInt();
        b=d.nextInt();
        c=d.nextInt();
        if(a<b&&a<c)
        {
            if(b<c)
                System.out.printf("%d %d %d",a,b,c);
            else
                System.out.printf("%d %d %d",a,c,b);
        }
        else if(b<a&&b<c)
        {
            if(a<c)
                System.out.printf("%d %d %d",b,a,c);
            else
                System.out.printf("%d %d %d",a,c,b);
        }
        else
        {
            if(a<b)
                System.out.printf("%d %d %d",c,a,b);
            else
                System.out.printf("%d %d %d",c,b,a);
            
        }
    }
}
