/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented;

import java.util.Date;

/**
 *
 * @author nakibamanturzo
 */
public class course_info extends course_teacher{
    private int fee;
    private String start_date;
    public void get_course_details(int a,String b)
    {
        fee=a;
        start_date=b;  
    }
    public void show_course_details()
    {
        show_course_teacher_info();
        System.out.println(fee);
        System.out.println(start_date);
        
    }
}
