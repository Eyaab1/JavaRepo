package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
     protected int nbrLegs;

    public Terrestrial() {
        super("", "", 0, false);
    }

    public Terrestrial(int nbrLegs, String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Legs: " + nbrLegs;
    }
}
