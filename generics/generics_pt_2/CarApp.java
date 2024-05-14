package generics.generics_pt_2;
import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private int price;
    private String name;
    private int stock;

    public Car(int price, String name, int stock) {
        this.price = price;
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.stock, otherCar.stock);
    }
}

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(100, "Toyota", 70));
        cars.add(new Car(200, "Honda", 50));
        cars.add(new Car(300, "Ford", 80));

        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println("Car Name: " + car.getName() + "\tCar Stock: " + car.getStock());
        }
    }
}