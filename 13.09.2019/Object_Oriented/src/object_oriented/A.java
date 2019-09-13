
package object_oriented;

public class A {
    private int id;
    private String name;
    private int age;
    private int cont_number;
    public void get_info(int a,String b,int c,int d)
    {
        id=a;
        name=b;
        age=c;
        cont_number=d;
    }
    public void show_info()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }
}
