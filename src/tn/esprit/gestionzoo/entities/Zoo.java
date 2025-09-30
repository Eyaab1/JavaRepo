package tn.esprit.gestionzoo.entities;
public class Zoo {

    private String name;
    private String city;
    private Animal[] animals;
    private int nbrCag = 0;

    private static final int MAX_CAGES = 25; 

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        if (nbrCages > MAX_CAGES) {
            this.animals = new Animal[MAX_CAGES];
        } else {
            this.animals = new Animal[nbrCages];
        }
    }


   


    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Full!! " + animal.getName());
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Already exists");
            return false;
        }
        if (animal.getAge() < 0) {
            System.out.println("Age cannot be negative");
            return false;
        }
        animals[nbrCag] = animal;
        nbrCag++;
        System.out.println("Done adding " + animal.getName());
        return true;
    }

    public void displayZoo() {
        System.out.println("Animals in " + this.name + ":");
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
            System.out.println("Does not exist");
            return false;
        }
        for (int i = index; i < nbrCag - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrCag - 1] = null;
        nbrCag--;

        System.out.println("Removed " + animal.getName());
        return true;
    }

    public boolean isZooFull() {
        return nbrCag >= animals.length;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.nbrCag > z2.nbrCag) ? z1 : z2;
    }
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getNbrCag() {
        return nbrCag;
    }

    public void setNbrCag(int nbrCag) {
        this.nbrCag = nbrCag;
    }

    public static int getMaxCages() {
        return MAX_CAGES;
    }
}
