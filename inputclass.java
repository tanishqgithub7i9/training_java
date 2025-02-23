import java.util.*;
public class inputclass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the name ");
         String name=sc.nextLine();
        
        System.out.println("enter your age");
        Float age=sc.nextFloat();
        
        System.out.println("enter a number ");
        int number= sc.nextInt();
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(number);
        sc.close();

    }
}
