//Breion Joshua
//March 3, 2026
//Computer Science II
public class Animal {

    //Variable that creates the species
    private String species;

    //Constructor that creates an empty species
    public Animal() {
        this.species = "";
    }
    //Constructor that creates a species
    public Animal(String species) {
        this.species = species;
    }
    //Method that gets and sets the species
    public String getSpecies() {
        return this.species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    //String method that returns the species
    public String toString() {
        return "Species: " + this.species;
    }
}
