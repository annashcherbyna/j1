package p_enum;

public enum Season {
    Winter(-5),
    Spring(5),
    Summer(27){
        @Override
        public void getDescription(){
            System.out.println("Теплое время года");
        }
    },
    Autumn(10);

    private double avgTemp;

    Season(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public void getDescription(){
        System.out.println("Холодное время года");
    }

    @Override
    public String toString() {

        return "Season{" +
                "avgTemp=" + avgTemp +
                '}';
    }
}
