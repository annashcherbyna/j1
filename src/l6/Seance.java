package l6;

import p_enum.Season;

import java.util.Objects;

public class Seance implements Comparable<Seance>{
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = addDuration(startTime,movie.getDuration());
    }

    @Override
    public int compareTo(Seance o) {
        return this.startTime.compareTo(o.getStartTime());
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance = (Seance) o;
        return Objects.equals(movie, seance.movie) &&
                Objects.equals(startTime, seance.startTime) &&
                Objects.equals(endTime, seance.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, startTime, endTime);
    }

    public Time addDuration(Time start,Time end){
        int mm = start.getMin() + end.getMin();
        int hh = start.getHour() + end.getHour()+ mm/60;
        mm = mm%60;
        if(hh>23){
            hh = hh -24;
        }
        return new Time(hh,mm);
    }

    @Override
    public String toString() {
        return "\t{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                "\t" + movie +
                '}';
    }
}
