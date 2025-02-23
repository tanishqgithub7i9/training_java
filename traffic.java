public class traffic{
    public static void main(String[]args){
        String color="red";
        switch(color){
            case "red":
                {
                    System.out.println("Stop");
                    break;
                }
                 case "yellow":
                {
                    System.out.println("Slow down");
                    break;
                }
                 case "green":
                {
                    System.out.println("Go");
                    break;
                }
                default:
                    {
                         System.out.println("default"); 
                    }
        }
    }
}