package p1;

// Java
//        3.Свторити клас User з полями
//        int id,
//        int age
//        String name,
//        String surname,
//        double weight,
//        double height.
//
//        Створити 10 об'єктів класу User.
//        Скласти між собою значення їх віку і вивести в консоль.
//        Скласти між собою значення їх ваги і вивести в консоль.
//        Скласти між собою значення їх зросту і вивести в консоль.
//
//        4. Зробити завдання 3, але 10 об'єктів покласти водин масив.
//        Скласти між собою значення їх віку і вивести в консоль.
//        Скласти між собою значення їх ваги і вивести в консоль.
//        Скласти між собою значення їх зросту і вивести в консоль.
//
//        5.
//        Створити клас Car
//        - кінські сили (або потужність)
//        - об'єм двигуна
//        + 5 полів придумати самостійно
//
//        Створити 10 об'єктів класу Car.
//        Скласти між собою значення їх об'ємів і вивести в консоль.
//        Скласти між собою значення їх потужностей і вивести в консоль.
//
//        6.
//        Зробити завдання 5 , але 10 об'єктів покласти в масив.
//        Скласти між собою значення їх об'ємів і вивести в консоль.
//        Скласти між собою значення їх потужностей і вивести в консоль.
//
//
//        7. За допомоги %, спробувати "реверснути" трьохзначне число. Приклад 412 => 214


import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        User u1 = new User(0,18,"Fedia","Zaicev",64.5,175.0);
        User u2 = new User(1,20,"Olya","Ivanova",50.1,178.0);
        User u3 = new User(2,25,"Katia","Mitina",56.0,165.0);
        User u4 = new User(3,28,"Masha","Karimova",70.0,176.5);
        User u5 = new User(4,30,"Pavel","Ivanov",66.2,180.0);
        User u6 = new User(5,19,"Taras","Ivanov",73.0,182.6);
        User u7 = new User(6,54,"Mila","Ivanova",64.5,190.2);
        User u8 = new User(7,43,"Oleg","Petrova",80.0,163.0);
        User u9 = new User(8,33,"Saha","Gagarin",70.7,177.0);
        User u10 = new User(9,15,"Lev","Dion",42.0,192.0);

        int sumAge = Stream.of(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10).mapToInt(User::getAge).sum();
        double sumWeight = Stream.of(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10).mapToDouble(User::getWeight).sum();
        double sumHeight = Stream.of(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10).mapToDouble(User::getHeight).sum();

        System.out.println("sum of age: " + sumAge);
        System.out.println("sum of weight: " + sumWeight);
        System.out.println("sum of height: "+ sumHeight);

        ArrayList<User> userArray = new ArrayList<>();
        userArray.add(u1);
        userArray.add(u2);
        userArray.add(u3);
        userArray.add(u4);
        userArray.add(u5);
        userArray.add(u6);
        userArray.add(u7);
        userArray.add(u8);
        userArray.add(u9);
        userArray.add(u10);

        sumAge = 0;
        sumWeight = 0;
        sumHeight = 0;

        for (User u:userArray
             ) {
            sumAge += u.getAge();
            sumHeight += u.getHeight();
            sumWeight += u.getWeight();
        }

        System.out.println("sum of age: " + sumAge);
        System.out.println("sum of weight: " + sumWeight);
        System.out.println("sum of height: "+ sumHeight);

        Car c1 = new Car("CX-5","Mazda",240,2.5,2019,"black");
        Car c2 = new Car("CX-7","Mazda",280,3.5,2020,"white");
        Car c3 = new Car("8000","Audi",260,2.2,2020,"red");
        Car c4 = new Car("Altea","Seat",220,1.8,2019,"black");
        Car c5 = new Car("600","BMV",260,3.5,2014,"black");
        Car c6 = new Car("CX-5","Jaguar",240,2.5,2020,"brown");
        Car c7 = new Car("CX-5","Suzuki",210,2.5,2020,"purple");
        Car c8 = new Car("","Audi",240,2.5,2020,"black");
        Car c9 = new Car("Juke","Nissan",180,1.4,2018,"white");
        Car c10 = new Car("2200","Lada",140,2.0,1985,"red");

        double sumPower = Stream.of(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10).mapToDouble(Car::getPower).sum();
        double sumEngineCap = Stream.of(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10).mapToDouble(Car::getEngineCap).sum();

        System.out.println("sum of Power: " + sumPower);
        System.out.println("sum of EngineCap: " + sumEngineCap);

        ArrayList<Car> carArray = new ArrayList<>();
        carArray.add(c1);
        carArray.add(c2);
        carArray.add(c3);
        carArray.add(c4);
        carArray.add(c5);
        carArray.add(c6);
        carArray.add(c7);
        carArray.add(c8);
        carArray.add(c9);
        carArray.add(c10);

        sumPower = 0.0;
        sumEngineCap = 0.0;

        for (Car c:carArray
             ) {
            sumPower += c.getPower();
            sumEngineCap += c.getEngineCap();
        }

        System.out.println("sumPower: " + sumPower);
        System.out.println("sumEngineCap: " + sumEngineCap);

        //5
        int num = 425;
        int num2 = 0;
        System.out.println(num + "->");
//        while(num != 0){
//            num2 = num % 10;
//            num = num/10;
//            System.out.println(num2);
//        }
        ReverseMethod(num);

    }

    public static void ReverseMethod(int number){
        if (number<10) {
            System.out.println(number);
        } else {
            System.out.println(number%10);
            ReverseMethod(number/10);
        }

    }

}
