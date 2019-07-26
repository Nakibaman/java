
package pyramids;

public class P3 {
    public static void main(String[] args) {
         int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=4;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
