package tn.esprit.gestionzoo.entities;
public class Animal {
 String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void displayAnimal() {
        System.out.println("Animal: " + name);
        System.out.println("Family: " + family);
        System.out.println("Age: " + age);
        System.out.println("Is Mammal: " + isMammal);
    }

    @Override
    public String toString() {
        return name + " (" + family + "), Age: " + age + ", Mammal: " + isMammal;
    }
}