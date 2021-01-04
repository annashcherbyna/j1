package l6;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Cinema {
    TreeMap <Days, Schedule> scheduleTreeMap;
    Time open;
    Time close;

    public Cinema(Time open,Time close) {
        this.scheduleTreeMap = new TreeMap<>();
        this.open = open;
        this.close = close;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    public boolean checkTime(Seance seance){

        int intStartTime = seance.getStartTime().getIntTime();
        if (this.open.compareTo(seance.getStartTime()) <=0 &&
                this.close.getIntTime() - intStartTime > seance.getMovie().getDuration().getIntTime()){
            return true;
        }
        return false;
    }

    //addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день)
//    public void addSeances (String day, Seance[] seances){
//        Set<Days> days = this.scheduleTreeMap.keySet();
//        for (Days dd: days
//             ) {
//            System.out.println(dd.toString());
//            if (dd.toString() == day){
//                for (Seance seance: seances
//                     ) {
//                    if(this.checkTime(seance.getStartTime(),seance.getEndTime())) {
//                        this.scheduleTreeMap.get(dd).addSeance(seance);
//                    }
//                }
//            }
//        }
//    }
    public void addSeances (Days day, Seance[] seances){
        TreeSet<Seance> seanceTreeSet = new TreeSet<Seance>();
                for (Seance seance: seances
                ) {
                    if(this.checkTime(seance)) {
                        seanceTreeSet.add(seance);
                    }
                }
        this.scheduleTreeMap.put(day,new Schedule(seanceTreeSet));

    }


    //addSeance (Seance, String) (додає один сеанс в конкретний день)
    public void addSeance ( Days day,Seance seance){
        if(this.checkTime(seance)){
            Set<Days> days = this.scheduleTreeMap.keySet();
            int haveDay = 0;
            for (Days dd : days
            ) {
                if (dd == day) {
                    this.scheduleTreeMap.get(dd).addSeance(seance);
                    haveDay += 1;
                }
            }
            if(haveDay == 0){
                this.scheduleTreeMap.put(day,new Schedule());
                this.scheduleTreeMap.get(day).addSeance(seance);
            }
        }
    }

    //removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу)
    public void removeMovie(Movie movie){
        Set<Days> days = this.scheduleTreeMap.keySet();
        for (Days day:days
             ) {
            Schedule schedule = this.scheduleTreeMap.get(day);
            TreeSet<Seance> seances = schedule.getSeance();
            Iterator<Seance> iterator = seances.iterator();
            while (iterator.hasNext()){
                Seance s = iterator.next();
                if(s.getMovie().equals(movie)){
                    iterator.remove();
                }
            }
        }
    }


    // (видаляє конкретний сеанс фільму в конкретний день, який задається параметром String).
    public void removeSeance (String dd,Seance seance) {
            Set<Days> days = this.scheduleTreeMap.keySet();
            for (Days day:days
            ) {
                if(dd.equals(day.toString())) {
                    Schedule schedule = this.scheduleTreeMap.get(day);
                    TreeSet<Seance> seances = schedule.getSeance();
                    Iterator<Seance> iterator = seances.iterator();
                    while (iterator.hasNext()){
                        Seance s = iterator.next();
                        if(s.equals(seance)){
                            iterator.remove();
                        }
                    }
                }
            }
    }

    @Override
    public String toString() {

        String string = "";
        Set<Days> days = this.scheduleTreeMap.keySet();
        for (Days day:days
        ) {
            string += day;
            string += ":\n";
            string += this.scheduleTreeMap.get(day).toString() + "\n" ;
        }

        return "\nCinema{" +
                "\nopen time: " + open +
                ", \nclose time: " + close +
                ", \nSchedule: \n" + string +
                '}';
    }
}
