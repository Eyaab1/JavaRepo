package tn.esprit.gestionzoo.entities;

public abstract class aquatic extends Animal {
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

     public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

    // Instruction 31 : redéfinition equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof aquatic)) return false;
        aquatic other = (aquatic) obj;
        return this.getName().equals(other.getName())
                && this.getAge() == other.getAge()
                && this.habitat.equals(other.habitat);
    }
}
