import java.util.Scanner;

public class Runner {

     // main

    public static void main(String[] args){
        //Creating pet information and outputting it to the console
        Pet pet1 = new Pet(null, null, 0);
        pet1.setType("Type");
        pet1.setName("Pet Name");
        pet1.speak();
        pet1.setAge(0);

        System.out.println(pet1);

        Pet pet2 = new Pet(null, null, 0);
        pet2.setType("Dog");
        pet2.setName("Bolt");
        pet2.speak();
        pet2.setAge(5);

        System.out.println(pet2);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter animal type: ");
        String type = input.nextLine();
    
        System.out.println("Enter animal name: ");
        String name = input.nextLine();
    
        System.out.println("Enter animal age: ");
        int age = input.nextInt();
    
        Pet userPet = new Pet(type, name, age);
        System.out.println(userPet);
        
        input.close();
    }
}
