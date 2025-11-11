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

    public String getFamily() { return family; }
    public void setFamily(String family) { this.family = family; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) throws InvalidAgeException {
    if (age < 0) {
        throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif !");
    }
    this.age = age;
}
    public boolean isMammal() { return isMammal; }
    public void setMammal(boolean mammal) { isMammal = mammal; }
}