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
public class SquareTester {
    public static void main(String[] args) {
        double h, w, a;
        Square s1 = new Square();
        s1.setHeight(3);
        s1.setWidth(4);
        h = s1.getHeight();
        w = s1.getWidth();
        a = s1.getArea();
        System.out.println("Height = "+ h); 
        System.out.println("Width = "+ w);
        System.out.println("Area = "+ a);

    }
 
}
