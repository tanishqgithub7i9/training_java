public class traffic{
    public static void main(String[]args){
        int color="red";
        switch(color){
            case red:
                {
                    System.out.prinln("Stop");
                    break;
                }
                 case Yellow:
                {
                    System.out.prinln("Slow down");
                    break;
                }
                 case red:
                {
                    System.out.prinln("Go");
                    break;
                }
                default:
                    {
                         System.out.prinln("default"); 
                    }
        }
    }
}