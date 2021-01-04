package l6;

import java.util.TreeSet;

public class Schedule {
    TreeSet<Seance> seances;

    public Schedule() {
        this.seances = new TreeSet<Seance>();
    }
    public Schedule(TreeSet treeSet) {
        this.seances = treeSet;
    }

    public void addSeance (Seance s){
        this.seances.add(s);
    }

    public void removeSeance (Seance s){
        this.seances.remove(s);
    }

    public TreeSet<Seance> getSeances() {
        return seances;
    }

    @Override
    public String toString() {
        String string ="";
        for (Seance s:this.seances
             ) {
            string += s.toString() +"\n" ;
        }

        return string;
    }
}
