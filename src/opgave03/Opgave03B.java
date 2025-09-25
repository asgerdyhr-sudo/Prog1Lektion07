package opgave03;

public class Opgave03B {
    public static void main(String[] args) {
        System.out.println(weekday(4,14));
    }

    public static String weekday(int dayOfWeek, int daysInTheFuture) {
        String[] weekdays = {"Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};
        dayOfWeek = (dayOfWeek + daysInTheFuture) % 7;
        return weekdays[dayOfWeek];
    }
}
