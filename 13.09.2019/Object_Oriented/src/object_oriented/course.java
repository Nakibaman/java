
package object_oriented;

public class course {
    private int id;
    private String name;
    private float credit;
    public void get_course_info(int a,String b,float c)
    {
       id=a;
       name=b;
       credit=c;
    }
    public void show_course_info()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(credit);
    }
}
