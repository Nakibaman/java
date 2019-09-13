
package object_oriented;

public class course_implementation {
    public static void main(String[] args) {
        course_teacher c1=new course_teacher();
        c1.get_course_info(131, "Java", 3);
        c1.get_course_teacher_info("Nahid Hasan", "Lecturer");
        c1.show_course_teacher_info();
        
    }
}
