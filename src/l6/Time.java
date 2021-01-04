package l6;

public class Time implements Comparable<Time>{
    int min;
    int hour;

    public Time() {
    }

    public Time( int hour,int min) {
        this.min = min;
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if(min>=0 && min<=59){
            this.min = min;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour>=0 && hour<=23){
            this.hour = hour;
        }
    }

    public void addDuration(Time d){
        int mm = this.getMin() + d.getMin();
        int hh = d.getHour() + mm/60;
        if(hh>23){
            hh = hh -24;
        }
        this.setHour(this.getHour()+hh);
        this.setMin(mm%60);
    }



    @Override
    public int compareTo(Time o) {
        int mm = this.hour*60 + this.min;
        int mmO = o.getHour()*60 + o.getMin();
        return mm-mmO;
    }

    @Override
    public String toString() {
        return
                "{hour: " + hour +
                        " min:" +  min +
                '}';
    }

    public int getIntTime(){
        return hour*60 + min;
    }
}
