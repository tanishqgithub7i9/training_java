public class FormatExample{
    public static void main(String args[]){
        String name="Swet";
        String sf1=String.format("name is %s",name);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %2f",32.33434);
        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);

           }
}