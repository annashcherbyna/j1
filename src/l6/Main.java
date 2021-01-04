package l6;

public class Main {
    public static void main(String[] args) {


    Cinema cinema = new Cinema(new Time(9,0),new Time(23,59));
    System.out.println(cinema);

    Movie moana = new Movie("Moana", new Time(1,59));
    Movie once_alone = new Movie("Once alone", new Time(1,40));
    Movie sinderella = new Movie("Sinderella", new Time(2,45));
    Movie coala = new Movie("Coala", new Time(2,10));

    Seance seanceMoana = new Seance(moana,new Time(10,0));
    Seance seanceOnce_alone = new Seance(once_alone,new Time(12,30));
    Seance seanceSinderella = new Seance(sinderella,new Time(23,30));
    Seance seanceCoala = new Seance(coala,new Time(15,30));
    Seance seanceMoana2 = new Seance(moana,new Time(13,0));

    Seance[] seances = {seanceMoana,seanceOnce_alone,seanceSinderella};
    cinema.addSeance(Days.Tuesday,seanceCoala);
    cinema.addSeance(Days.Tuesday,seanceOnce_alone);
    cinema.addSeances(Days.Monday,seances);
    cinema.addSeance(Days.Tuesday,seanceMoana2);


    System.out.println(cinema);
    System.out.println("\nremove moana");
    cinema.removeMovie(moana);

    System.out.println(cinema);

    System.out.println("\nremove seanceOnce_alone from Tuesday");
    cinema.removeSeance ("Tuesday",seanceOnce_alone);

    System.out.println(cinema);

//    Даний проект має такі сутності: Days, Time, Movie, Seance, Schedule, Cinema.
//    enum Days:
//            - прописати дні тижня;
//    Time:
//            - int min, int hour;
//    - передбачити межі для цих полів (для min 0..59, для hour 0..23);
//    Movie:
//            - String title, Time duration (або ж можете забити на власний Time і використати java.time.Duration, як і тут, так і в інших класах. це за власним бажанням)
//    Seance:
//            - Movie movie, Time startTime, Time endTime;
//   - в конструктор має надходити параметрами значення для перших двох полів, третє поле повинне обчислюватись (start + duration);
//    Schedule:
//            - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
//   - Сортування по startTime.
//   - методи: addSeance (Seance), removeSeance (Seance);
//    Cinema:
//            - TreeMap<Days, Schedule>, Time open, Time close;
//   - врахувати час відкриття і закриття при формуванні сеансів!
//            - методи: addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день), addSeance (Seance, String) (додає один сеанс в конкретний день), removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу), removeSeance (Seance, String) (видаляє конкретний сеанс фільму в конкретний день, який задається параметром String).
//
//    Main class:
//            - створення об'єкту Cinema;
//            - викликаємо всі методи Cinema
//
//    Для кожного класу зробити адекватний toString, щоб все було читабельно і доступно. Там де потрібно, зробити compareTo(). Маєте якісь власні ідеї для розробки - будь-ласка. Це моделювання роботи кінотеатру, тому все що наблизить програму до реальності вітається.
    }
}
