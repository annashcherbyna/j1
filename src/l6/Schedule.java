package l6;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    TreeSet<Seance> seance;

    public Schedule() {
        this.seance = new TreeSet<Seance>();
    }
    public Schedule(TreeSet treeSet) {
        this.seance = treeSet;
    }

    public void addSeance (Seance s){
        this.seance.add(s);
    }

    public void removeSeance (Seance s){
        this.seance.remove(s);
    }

    public TreeSet<Seance> getSeance() {
        return seance;
    }

    @Override
    public String toString() {
        String string ="";
        for (Seance s:this.seance
             ) {
            string += s.toString() +"\n" ;
        }

        return string;
    }
}
