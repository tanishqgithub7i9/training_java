class car{
    String brand;
    int speed;
    void display(){
        System.out.println("car speed:"+ brand);
        System.out.println("car speed:"+ speed+"km/h");
    
    }
}
public class objectExamp{
    public static void main(String args[]){
        car mycar=new car();
        mycar.brand="Toyota";
        mycar.speed=120;
        mycar.display();
    }
}