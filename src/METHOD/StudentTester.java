/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METHOD;

/**
 *
 * @author ABIR
 */
public class StudentTester {
    public static void main(String[] args) {
        Student john=new Student();
        Student mike=new Student();
        Student carol=new Student();
        john.setName("JOHN");
        john.setID("55");
        john.setAddress("Dhaka");
        john.setCGPA(3.3);
        mike.setName("MIKE");
        mike.setID("12301019");
        mike.setAddress("Budapest");
        mike.setCGPA(2.76);
        carol.setName("JOHN");
        carol.setID("23");
        carol.setAddress("Spain");
        carol.setCGPA(2.3);
        System.out.println(john.getName()+" "+ john.getID()+" "+john.getAddress()+" "+john.getCGPA());
        System.out.println(mike.getName()+" "+ mike.getID()+" "+mike.getAddress()+" "+mike.getCGPA());
        System.out.println(carol.getName()+" "+ carol.getID()+" "+carol.getAddress()+" "+carol.getCGPA());
        System.out.println(john);
        System.out.println(mike);
        System.out.println(carol);
    }
}
