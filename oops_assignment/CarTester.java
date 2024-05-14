package oops_assignment;


class Car{
private String make;
private String model;
Car(String m,String b){
    this.make=m;
    this.model=b;
}
public void setMake(String m){
    this.make=m;
}
public String getMake(){
    return make;
}
public void setModel(String n) {
   this.model=n;
}
public String getModel()
{
    return model;
}
}
public class CarTester {
    public static void main(String[] args) {
         Car myCar1=new Car("Toyota","Corolla");  //creating object of the car class
   Car myCar2=new Car(null,null);
   System.out.println(myCar1.getMake());           //access
   System.out.println(myCar1.getModel());          //access
  System.out.println(myCar2.getMake());            //access
  System.out.println(myCar2.getModel());
  myCar2.setMake("Hero");
  myCar2.setModel("Honda");
  System.out.println(myCar2.getMake());
  System.out.println(myCar2.getModel());
    }
  
   
}
