import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Movies {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> movie_list = new ArrayList<>();
        Random randomizer = new Random();
        String control = "";

        while (!control.equalsIgnoreCase("q")){
            System.out.print("Enter your favorite movie: ");
            movie_list.add(keyboard.nextLine());
            System.out.print("Press 'Q' to quit or anything else to keep entering movies: ");
            control = keyboard.nextLine();
        }

        System.out.println("\n" + movie_list);
        Collections.sort(movie_list);
        System.out.println("\nIn alphabetical order: " + movie_list);

        int rand_index = randomizer.nextInt(movie_list.size());
        System.out.print("\nHere is a movie suggestion: " + movie_list.get(rand_index));
    }
}
