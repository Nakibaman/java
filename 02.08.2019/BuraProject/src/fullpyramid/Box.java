
package fullpyramid;

public class Box {
    public void show_box() {
        int i,j,k;
        k=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==1||j==1||i==5||j==5||i==j||i+j==6)
                    System.out.print("*");
                else
                    {System.out.print(k);k++;}
            }
            System.out.println();
        }
    }
}
