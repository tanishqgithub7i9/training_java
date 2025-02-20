class Car {
private String brand = "Toyota"; 

 void displayBrand() { 
        System.out.println("Car Brand: " + brand);
    }
}
public class privateExamp {
public static void main(String[] args) {
        Car myCar = new Car(); 
        System.out.println(myCar.brand); 
       myCar.displayBrand();
    }
}
