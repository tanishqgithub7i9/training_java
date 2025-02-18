public class nested{
    public static void main(String []args){
        String address="Delhi,india";
        
        if(address.endsWith("india")){
            if(address.endsWith("Meerut")){
            System.out.println(" Your city is Meerut");
            }
        
        else if(address.contains("Noida")){
             System.out.println("city is Noida");
        }
         
        else {
              System.out.println(address.split(",")[0]);
        }
        }
         else {
              System.out.println("You are living in india");
        }
    }
}