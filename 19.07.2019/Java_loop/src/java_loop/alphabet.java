
package java_loop;

import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        char c;
        System.out.printf("Enter a charecter");
        Scanner o=new Scanner(System.in);
        c=o.next().charAt(0);
        if(c>='0'&&c<='9')
            System.out.printf("Number");
        else if(c>='A' && c<='Z')
            System.out.printf("Alphabet");
        else if(c>='a' && c<='z')
            System.out.printf("Alphabet");
        else
            System.out.printf("Special Charecter");
        //0-9;A-Z;a-z;$#@
        //Number;Alphabet;Special charecter
    }
}
