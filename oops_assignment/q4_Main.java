package oops_assignment;
class Laptop
{
    private String model;
    private double price;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    //overriding the tostring method
    @Override
    public String toString()  
    {  
        return "Laptop [ Model = "+getModel() + ", Price = "+getPrice()+"]";  
    } 
   
}
public class q4_Main {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.setModel("Lenovo");
        l1.setPrice(50000.00);
       System.out.println( l1.toString());
    }
}
