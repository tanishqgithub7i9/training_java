
import java.util.LinkedList;

public class BulletBikeList {
    public static void main(String[] args) {
       
        LinkedList<String> bulletBikes = new LinkedList<>();

        bulletBikes.add("Royal Enfield Classic 350");
        bulletBikes.add("Royal Enfield Bullet 350");
        bulletBikes.add("Royal Enfield Meteor 350");
        bulletBikes.add("Royal Enfield Hunter 350");
        bulletBikes.add("Royal Enfield Interceptor 650");
        bulletBikes.add("Royal Enfield Himalayan 450");

       
        System.out.println("List of Bullet Bikes:");
        for (String bike : bulletBikes) {
            System.out.println("- " + bike);
        }

       
        bulletBikes.remove("Royal Enfield Bullet 350");
        System.out.println("\nAfter removing Bullet 350:");
        for (String bike : bulletBikes) {
            System.out.println("- " + bike);
        }

       
        bulletBikes.set(2, "Royal Enfield Super Meteor 650");
        System.out.println("\nAfter updating the 3rd bike:");
        for (String bike : bulletBikes) {
            System.out.println("- " + bike);
        }

      
        String searchBike = "Royal Enfield Classic 350";
        if (bulletBikes.contains(searchBike)) {
            System.out.println("\nYes, " + searchBike + " is in the list.");
        } else {
            System.out.println("\nNo, " + searchBike + " is not in the list.");
        }
    }
}
