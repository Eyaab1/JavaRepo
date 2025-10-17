package tn.esprit.gestionzoo.entities;

public class aquatic extends Animal {
      protected String habitat;

    public aquatic() {
        super("", "", 0, false);
    }

   public aquatic(String habitat, String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
}
