
package object_oriented;

public class course_implementation {
    public static void main(String[] args) {
        course_info c1=new course_info();
        c1.get_course_info(131, "Java", 3);
        c1.get_course_teacher_info("Nahid Hasan", "Lecturer");
        c1.get_course_details(2000, "22/10/2019");
        c1.show_course_details();
        
    }
}
