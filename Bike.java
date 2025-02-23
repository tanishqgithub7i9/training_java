class Bike{
   final int speed;

    // for initializing the final variable create constructor

    Bike(){
        speed = 100;
    }
    Bike(int speed){
        this.speed = speed;
    }

    public static void main(String[] args){
        Bike b = new Bike();
        System.out.println(b.speed);
        Bike b1 = new Bike(200);
        System.out.println(b1.speed);
    }
}


    