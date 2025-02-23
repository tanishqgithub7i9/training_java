import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        String color; // Assign a valid string value

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color: ");
        color = sc.nextLine();

        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
        }

        sc.close();
    }
}
