import java.util.Scanner;

public class ZooManagement {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name of the zoo: ");
        String zooName = scanner.nextLine();
        while (zooName.isEmpty()) {
            System.out.print("Not empty ");
            zooName = scanner.nextLine();
        }
        System.out.print("enter the nbr of the cages");
        int nbrCages = -1;
        while (nbrCages <= 0) {
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                if (nbrCages <= 0) {
                    System.out.print("it must be positive!! ");
                }
            } else {
                System.out.print("must be a number!!");
                scanner.next(); 
            }
        }
        System.out.println("Zoo " + zooName + " has " + nbrCages + " cages.");
        scanner.close();
    }
}
