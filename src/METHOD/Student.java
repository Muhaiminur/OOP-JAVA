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
public class Student {
    String name;
    String id;
    String address;
    double cgpa;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setID(String i){
        id=i;
    }
    public String getID(){
        return id;
    }
    public void setAddress(String a){
        address=a;
    }
    public String getAddress(){
        return address;
    }
    public void setCGPA(double c){
        cgpa=c;
    }
    public double getCGPA(){
        return cgpa;
    }
    public String toString(){
        return "Name = "+name+" id = "+id+" address= "+address+" cgpa = "+cgpa;
    }
}
