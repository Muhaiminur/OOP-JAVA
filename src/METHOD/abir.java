package METHOD;
public class abir{
  int age=0;
  String name="ABIR";
  //there r 3 types of method
   //       void(can not reply)
  //VOID WITH PARAMETER
    //public o->p name(p->o)
  //number 1 method
  public void standUp(){
    System.out.println(name+" stand up");
  }
  //number 2 method
  public void call(int num){
    System.out.println(num);
  }
  //number 2 variety
  public void setID(int a){
    age=a;
    //we can print it   System.out.println(name);
  }
  //number 3 method
  public int getID(){
    return age;
  }
  
  
}
