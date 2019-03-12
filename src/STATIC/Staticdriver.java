package STATIC;
public class Staticdriver{
  public static void main(String [] args){
    System.out.println(static1.x);
    static1 t1 = new static1();
    t1.x = 4000;
    static1.met();
    t1.met();
    
    System.out.println(static1.x);
    static1 t2 = new static1();
    t2.met();
    System.out.println(t2.x);
    System.out.println(static1.x);
    
  }
}