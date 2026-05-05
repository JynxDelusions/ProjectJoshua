//Breion Joshua
//May 4th, 2026
//Computer Science II
import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        ArrayList<String> Alist = new ArrayList<>();
        ArrayList<Integer> Blist = new ArrayList<>();

        //Adds elements to the two lists
        Alist.add("Persona");
        Alist.add("Metaphor");
        Alist.add("Pokemon");
        Alist.add("Tomodachi");
        Blist.add(1);
        Blist.add(2);
        Blist.add(3);
        Blist.add(4);

        //Display the content of Alist and Blist on a single line
        System.out.println("Titles");
        for (int i = 0; i < Alist.size(); i++) {
            System.out.print(Alist.get(i));
            if (i < Alist.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        System.out.println("Numbers");
        for (int i = 0; i < Blist.size(); i++) {
            System.out.print(Blist.get(i));
            if (i < Blist.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        //Removing and changing elements in the lists\
        Alist.remove("Pokemon");
        Blist.set(2, 20);

        //Displays content changes
        System.out.println("Title Changes");
        for (int i1 = 0; i1 < Alist.size(); i1++) {
            System.out.print(Alist.get(i1));
            if (i1 < Alist.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.println("Number Changes");
        for (int i1 = 0; i1 < Blist.size(); i1++) {
            System.out.print(Blist.get(i1));
            if (i1 < Blist.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
