package tn.esprit.gestionzoo.entities;

public class Penguin extends aquatic {
    private float swimmingDepth;

    public Penguin() {
        super();
    }

    public Penguin(float swimmingDepth, String habitat, String family, String name, int age, boolean isMammal) {
        super(habitat, family, name, age, isMammal);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth + " meters";
    }
}
