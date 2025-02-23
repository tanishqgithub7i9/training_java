import java.util.Scanner;
public class InputExamp {
    public static void main(String args[]){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter a number");
        int number=name .nextInt();
        System.out.println("You have intered:"+number);
        name.close();
    }
}
