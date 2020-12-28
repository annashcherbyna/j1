package l5;

//Створити клас Product (назва, ціна, тип (для цього можете створити енум) і ще 1-3 поля за власним бажанням). Приватні поля, гетери-сетери, констркутор, туСтрінг, equals&hashcode.
//        Створити клас Store, який матиме поле - List продуктів. Конструктор класу store не має жодних параметрів, в тілі просто ініціалізує List (new ArrayList<>).
//        В класі Store створити, і в мейні викликати, наступні методи:
//        1. Додати продукт в магазин. Але перш ніж додати його в ліст, здійснити валідацію (чи ціна не від'ємна, чи в назві товару не присутні цифри).
//        2. Видалити продукт з магазину по назві.
//        3. Збільшити ціну для вказаного у параметрі типу продуктів удвічі
//        4. Усі товари, дорожчі вказаної суми, записати у окремий ліст і вивести його на екран (наприклад "В нашому магазині продаються такі преміум товари:...)
//        5. Порахувати загальну суму усіх товарів вказаного у вхідному параметрі типу і вивести її на екран
//        6. Порахувати середню вартість усіх товарів в магазині і вивести це число на екран

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("tost",14.5,"bread",10.0,1.0);
        Product p1 = new Product("baget",24.7,"bread",10.0,1.0);
        Product p2 = new Product("organic milk ",32.5,"milk",5.0,1.0);
        Product p3 = new Product("coco milk ",52.5,"milk",5.0,1.0);

        Product p4 = new Product("nuts milk ",0.0,"milk",5.0,1.0);

//        List<Product> listProd = new ArrayList<>();
//        listProd = Arrays.asList(p,p1,p2,p3);
//        System.out.println(listProd);

        Store store = new Store();
        store.addProduct(p);
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        store.addProduct(p4);
        System.out.println(store);


        System.out.println(store.avgPrice("milk"));
        store.doublePrice("bread");
        System.out.println(store.premiumSet(50.0));
        System.out.println(store.sumPrice("milk"));
    }
}
