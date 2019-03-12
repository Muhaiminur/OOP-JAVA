package SCOPE;
public class BU{
  
  public void vc(){
    int [] x = {2013};
    System.out.println("vc "+x[0]);
    cofd(x);
    System.out.println("aft call to cofd "+x[0]);
  }
  private void cofd(int [] x){
    System.out.println("cofd "+x[0]);
    x[0] = 1013;
    dco(x[0]);
    System.out.println("aft call to dco "+x);    
  }
  private void dco(int  x){
    System.out.println("dco "+x);
    x = 3013;
    System.out.println("dco "+x);
  }
  
}