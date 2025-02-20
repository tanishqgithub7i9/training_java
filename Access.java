
class Car {
    public String brand = "Toyota"; 

    public void displayBrand() { 
        System.out.println("Car Brand: " + brand);
    }
}

public class Access {
    public static void main(String[] args) {
        Car myCar = new Car(); 
        System.out.println(myCar.brand); 
        myCar.displayBrand();
}
}
