import java.util.Scanner;

public class ZooManagement {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name of zoo: ");
        String zooName = scanner.nextLine();
        while (zooName.isEmpty()) {
            System.out.print("no empty!");
            zooName = scanner.nextLine();
        }

        System.out.print("city: ");
        String city = scanner.nextLine();
        while (city.isEmpty()) {
            System.out.print("no empty ");
            city = scanner.nextLine();
        }
        System.out.print("nbrCage: ");
        int nbrCages = -1;
        while (nbrCages <= 0) {
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                if (nbrCages <= 0) {
                    System.out.print("positive!! ");
                }
            } else {
                System.out.print("number!! ");
                scanner.next();
            }
        }
        Zoo myZoo = new Zoo(zooName, city, nbrCages);
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        myZoo.animals[0] = lion;

        myZoo.displayZoo();
        lion.displayAnimal();

        System.out.println(myZoo);
        System.out.println(lion);

        scanner.close();
    }
}
