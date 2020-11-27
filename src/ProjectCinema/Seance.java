package ProjectCinema;

public class Seance {
    Movie movie;
    Time startTime;
    Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
    }

    Seance endTime = startTime + movie.duration;
}
