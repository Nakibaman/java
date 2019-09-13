
package object_oriented;

public class course_implementation {
    public static void main(String[] args) {
        course c1=new course();
        c1.get_course_info(131, "Java", 3);
        c1.show_course_info();
        course c2=new course();
        c2.get_course_info(132, "Java Lab", (float)1.5);
        c2.show_course_info();
        
    }
}
