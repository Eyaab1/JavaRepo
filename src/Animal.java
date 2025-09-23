class Animal {
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
        System.out.println("animal: " + name);
        System.out.println("family: " + family);
        System.out.println("age: " + age);
        System.out.println("is Mammal: " + isMammal);
    }

    @Override
    public String toString() {
        return name + " (" + family + "), Age: " + age + ", Mammal: " + isMammal;
    }
}