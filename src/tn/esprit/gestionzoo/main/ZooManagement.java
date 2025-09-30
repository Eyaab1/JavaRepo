package tn.esprit.gestionzoo.main;
import java.util.Scanner;

import tn.esprit.gestionzoo.entities.*;


public class ZooManagement {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("name: ");
        String zooName = scanner.nextLine();
        //check empty or no
        while (zooName.isEmpty()) {
            System.out.print("not empty");
            zooName = scanner.nextLine();
        }

        System.out.print("City: ");
        String city = scanner.nextLine();
        while (city.isEmpty()) {
            System.out.print("Not empty");
            city = scanner.nextLine();
        }

        System.out.print("nbrCgae ");
        int nbrCages = -1;
        while (nbrCages <= 0) {
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                if (nbrCages <= 0) {
                    System.out.print("positive! ");
                }
            } else {
                System.out.print("number! ");
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
