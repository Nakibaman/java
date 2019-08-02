
package fullpyramid;

public class FullPyramid {

    public void show_pyramid() {
        int i,j;
        for(i=1;i<=3;i++)
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
