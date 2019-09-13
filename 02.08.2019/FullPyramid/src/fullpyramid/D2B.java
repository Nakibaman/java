
package fullpyramid;

public class D2B {
    public static void main(String[] args) {
        int n=5,r,i=0;
        int b[];
        b=new int[100];
        while(n!=0)
        {
            r=n%2;
            
            b[i]=r;i++;
            n=n/2;
        }
        
        
        for(int j=i-1;j>=0;j--)
            System.out.print(b[j]);
        
    }
}
