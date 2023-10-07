import art.Song;
import job.Artist;

public class mainn {
    public static void main(String[] args) {
        Artist a1 = new Artist("Alan Walker", "1997-08-24");
        Artist a2 = new Artist("Ari Lasso", "1973-01-17");

        System.out.println("Info Artist a1:");
        System.out.println("Name: " + a1.getName());
        System.out.println("Birthdate: " + a1.getBirthday());
        System.out.println();

        System.out.println("Info Artist a2:");
        System.out.println("Name: " + a2.getName());
        System.out.println("Birthdate: " + a2.getBirthday());
        System.out.println();

        Song song1 = new Song("Not You", a1, "2021-12-03");
        Song song2 = new Song("Hampa", a2, "2003-02-10");

        System.out.println("Info Song song1:");
        song1.displayInfo();
        System.out.println();

        System.out.println("Info Song song2:");
        song2.displayInfo();
    }
}
