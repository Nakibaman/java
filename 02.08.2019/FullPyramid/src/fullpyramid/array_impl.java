
package fullpyramid;

import java.util.Scanner;


public class array_impl {
    public static void main(String[] args) {
        int a[];
        a=new int[3];
        int i;
        Scanner ob=new Scanner(System.in);
        for(i=0;i<3;i++)
            a[i]=ob.nextInt();
        
        for(i=2;i>=0;i--)
        System.out.println(a[i]);
        
    }
}
