/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle;

import edu.salle.custommoodle.businesslogic.StudentBLO;
import edu.salle.custommoodle.model.Student;
import edu.salle.custommoodle.view.StudentWindow;
import java.util.List;

/**
 *
 * @author luisd
 */
public class App {
    public static void main(String[] args) {
//        Student s1 = new Student("Alex", "Cornejo");
//        Student s2 = new Student("Francisco", "Pérez");
//        Student s3 = new Student("Sofìa", "Enríquez");
//        Student s4 = new Student("Karol", "Jí");
//        
//        StudentBLO studentBLO = new StudentBLO();
//        studentBLO.save(s1);
//        studentBLO.save(s2);
//        studentBLO.save(s3);
//        studentBLO.save(s4);
//        
//        List<Student> studentList = studentBLO.findAll();
//        for(Student student : studentList)
//        {
//            System.out.println(student);
//            System.out.println("");
//        }
//        
//        studentBLO.delete(s3);
//        System.out.println(studentBLO.findAll().size());
//        
//        Student s = new Student("Alex", "Acosta");
//        s.setId(1);
//        
//        for(Student student : studentList)
//        {
//            System.out.println(student);
//            System.out.println("");
//        }
//        
//        
        StudentWindow window = new StudentWindow();
        window.setVisible(true);
    }
    
}
