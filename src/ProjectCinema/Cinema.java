package ProjectCinema;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Cinema {
    TreeMap<Days, Schedule> schedules;
    ArrayList<Movie> moviesLibrary = new ArrayList<>();
    int TimeOpen;
    int TimeClosed;
    Scanner sc = new Scanner(System.in);

    public void addMovie() {
        System.out.println("Enter the name of the film:");
        String filmName = sc.nextLine();
        System.out.println("Enter the quantity of hours of the film:");
        int filmHours = sc.nextInt();
        System.out.println("Enter the quantity of minutes of the film:");
        int filmMinutes = sc.nextInt();
        Time filmDuration = new Time(filmHours, filmMinutes);
        moviesLibrary.add(new Movie(filmName, filmDuration));

    }

    public void addSeance() {

    }

    public void removeMovie() {

    }

    public void removeSeance() {

    }

}
