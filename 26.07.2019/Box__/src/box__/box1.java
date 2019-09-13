
package box__;

import java.util.Scanner;

public class box1 {
    public static void main(String[] args) {
        int i,j,n,k;
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        k=1;
        for(j=1;j<=n;j++)
        {
            for(i=1;i<=n;i++)
            {
                if(i==1||i==n||j==1||j==n)
                    System.out.print("*");
                else
                {System.out.print(k);k++;}
            }
            System.out.println();
        }
    }
}
