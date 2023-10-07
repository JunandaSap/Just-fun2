package art;

import job.Artist;

public class Song {
    private String title;
    private Artist artist;
    private String release;

    public Song(String title, Artist artist, String _release){
        this.title = title;
        this.artist = artist;
        this.release = _release;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getRelease() {
        return this.release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public void displayInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Artist: " + this.artist.getName());

        // Menggunakan metode getAge dari kelas Artist
        int artistAge = this.artist.getAge();
        System.out.println("Artist Age is " + artistAge + " when song released");
    }  
}

