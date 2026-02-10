public class Pet
{
//private data fields

    private String name;
    //public Constructor(s)

    public Pet(){
        this.setName("");
    }
    //public set or mutator method for every private data field  
    public void setName(String newName){
        this.name = newName;
    }
    //public get or accessor method for every private data field
    public String getName(){
        return this.name;
    }
    //public toString method that prints out all of the object state
    public String toString(){
        String output = "Pet Information:\nName: " + this.name;
        return output;
    }


    // main

    public static void main(String[] args){
        //create an object of the class and test all methods
        Pet pet1 = new Pet();
        pet1.setName("Pet Name");
        System.out.println(pet1);

        Pet SecondPet = new Pet();
        SecondPet.setName("Bolt");
        System.out.println(SecondPet);
    }
}