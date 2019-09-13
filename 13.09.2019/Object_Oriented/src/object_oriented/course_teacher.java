
package object_oriented;

public class course_teacher extends course{
    private String name;
    private String designation;
    public void get_course_teacher_info(String a,String b)
    {
        name=a;
        designation=b;
    }
    public void show_course_teacher_info()
    {
        show_course_info();
        System.out.println(name);
        System.out.println(designation);
    }
}
