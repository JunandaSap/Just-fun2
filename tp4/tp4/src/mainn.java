import job.Artist;

public class mainn {
    public static void main(String[] args) {
        // Membuat objek Artist
        Artist artist = new Artist("John Doe", "1990-05-15");
        String name = artist.getName();
        System.out.println("Name: " + name);
        String birthday = artist.getBirthday();
        System.out.println("Birthday: " + birthday);
        int age = artist.getAge();
        System.out.println("Age: " + age);
    }
}
