
package fullpyramid;

public class FullPyramid {

    public static void main(String[] args) {
        int i,j;
        for(i=1;;i++)
        {
            for(j=3;j>i;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
