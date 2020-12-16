package hw_enum;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(Sizes.S,300.50,"red");
        Pants pants = new Pants(Sizes.M,500,"green");
        Dress dress = new Dress(Sizes.L,230.5,"grey");
        Tie tie = new Tie(Sizes.S,55,"blue");

        tie.dressMan();
        dress.dressWoman();

        ArrayList<Clothes> clothesArrayList = new ArrayList<>();
        clothesArrayList.add(tshirt);
        clothesArrayList.add(pants);
        clothesArrayList.add(dress);
        clothesArrayList.add(tie);

        Atelier atelier = new Atelier(clothesArrayList);
        System.out.println("Clothes for man: ");
        System.out.println(atelier.manClothes());
        System.out.println("Clothes for woman: ");
        System.out.println(atelier.womanClothes());


    }
}
