package tn.esprit.gestionzoo.entities;
public class Zoo {

    public String name;
    public String city;
    public Animal[] animals;
    int nbrCag = 0;

    static final int nbrCages = 25;

    public Zoo(String name, String city,int nbrCages) {
       this.name = name;
        this.city = city;
        this.nbrCag = nbrCages;
        this.animals = new Animal[25];
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("full!! " + animal.name);
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println(" already exist");
            return false;
        }
        if (animal.age <0) {
            System.out.println("age cannot be negative");
            return false;
        }
        animals[nbrCag] = animal;
        nbrCag++;
        System.out.println("done adding" + animal.name);
        return true;
    }
    public void displayZoo() {
        System.out.println("animals:" + this.name + ":");
        for (int i = 0; i < nbrCag; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCag; i++) {
            if (animals[i].equals(animal)) {
                return i;


            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("do not exist");
            return false;

        }
        for (int i = index; i < nbrCag - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrCag - 1] = null;
        nbrCag--;

        System.out.println("not found");
        return true;
    }

    public boolean isZooFull() {

        return nbrCag >= nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.nbrCag > z2.nbrCag) ? z1 : z2;
    }
}
