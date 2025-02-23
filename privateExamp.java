class Car {
    private String brand = "Toyota"; 

    void displayBrand() { 
        System.out.println("Car Brand: " + brand);
    }

    // as brand is private so, you cant access it via . directly you have to create a function that shloud return it's value.
    String getBrand() {
        return brand;
    }

}
public class privateExamp {
public static void main(String[] args) {
        Car myCar = new Car(); 
        System.out.println(myCar.getBrand()); 
       myCar.displayBrand();
    }
}
