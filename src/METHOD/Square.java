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
public class Square {
    double height;
    double width;
    public void setHeight(double h){
        height=h;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth (double w){
        width=w;
    }
    public double getWidth (){
        return width;
    }
    public double getArea (){
        return height*width;
    }
}
