package generics;
class Car{
    String model;
    String color;
    int speed;
    
    public void setModel(String m){model = m;}
    public void setColor(String c) {color=c;}
    public void setSpeed(int s)  {speed=s;}
Car(String m, String c, int s){
        model = m;
        color = c;
        speed = s;
}
public int compareTo(Object o)
{
    if(o instanceof Car)
    {
        Car othercar = (Car) o;
          if(this.speed>othercar.speed)
    {
        System.out.println(this.model+ " is faster");
return 1;
    } else if (this.speed<othercar.speed)
   {    
    System.out.println(othercar.model + " is faster");
    return-1;
   }else
   {
    System.out.println("Both cars are going at the same speed.");
    return 0;
   }
    }
    else
    return -1;
    }
  
  
    
}
public class Driver_q3 {
    public static void main(String[] args) {
        Car car1=new Car("Hero", "Blue", 5);
Car car2=new Car("Toyota","Green", 3);
System.out.println(car1.compareTo(car2));
    }
}
