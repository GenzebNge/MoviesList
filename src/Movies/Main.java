package Movies;

import Movies.Movies;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static  ArrayList<String>myMoviesList = new ArrayList<String>();
    public static void main(String[] args) {
       Movies movies = new Movies();
        Scanner scan = new Scanner(System.in);
        String yesNo ="";

        do {
            System.out.println("Enter your favorite movy");
              myMoviesList.add(scan.next());

            System.out.println("Do you want to enter other movie? /yes/No");
            yesNo = scan.next();


        }while (yesNo.equalsIgnoreCase("yes"));

       for(String movyList : myMoviesList){
           System.out.println(movyList);
       }
    }
}
