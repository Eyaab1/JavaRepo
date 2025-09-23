public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCage;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCage = nbrCages;
        this.animals = new Animal[25]; 
    }

    public void displayZoo() {
        System.out.println("zoo Name: " + name);
        System.out.println("city: " + city);
        System.out.println("nbr " + nbrCage);
    }

    @Override
    public String toString() {
        return "Zoo " + name + " in " + city + " with " + nbrCage + " cages.";
    }

}
