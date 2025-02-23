// first create a abstract class
abstract class Vehicle{
    abstract void start();
    abstract void stop();
}

class Bike extends Vehicle{
    @Override // just a tag to tell that this function is overriding the function of the parent class
    void start(){ // definition of the functions (in short : function overriding)
        System.out.println("Bike is started"); 
    }
    @Override // this tag is usually for developer okay. 
    void stop(){
        System.out.println("Bike is stopped");
    }
}

public class AbstractExample{
    public static void main(String[] args){
        Vehicle obj = new Bike();
        obj.start();
        obj.stop();
    }
}
