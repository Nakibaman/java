
package pyramids;


public class P4 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i-1;j++)
            {
                System.out.print("  ");
            }
            for(j=5;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
