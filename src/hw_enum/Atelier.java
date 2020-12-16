package hw_enum;

import java.util.ArrayList;

public class Atelier {
    ArrayList<Clothes> clothes;

    public Atelier(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public ArrayList<Clothes> manClothes(){
        ArrayList<Clothes> manClo = new ArrayList<>();
        for (Clothes clo:
             this.clothes) {
            if (clo instanceof ManClothes){
                manClo.add(clo);
            }
        }
        return manClo;
    }
    public ArrayList<Clothes> womanClothes(){
        ArrayList<Clothes> womanClo = new ArrayList<>();
        for (Clothes clo:
             this.clothes) {
            if (clo instanceof WomenClothes){
                womanClo.add(clo);
            }
        }
        return womanClo;
    }
}
