package tn.esprit.gestionzoo.entities;

public class Dolphin extends aquatic {
    private float swimmingSpeed;
    public Dolphin() {
        super();
    }

    public Dolphin(float swimmingSpeed, String habitat, String family, String name, int age, boolean isMammal) {
        super(habitat, family, name, age, isMammal);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
        public void swim() {
        System.out.println("the speed of swimming is" + swimmingSpeed );
    }

    @Override
    public String toString() {
        return super.toString() + ", swimming Speed: " + swimmingSpeed + " km/ h";
    }
}
