package job;

public class Artist {
    private String name;
    private String birthday;

    public Artist(String name, String birthday) {
        this.name = name;
        this.birthday = convert(birthday);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = convert(birthday);
    }

    public int getAge() {
        int tahunLahir = Integer.parseInt(birthday.substring(0, 4));
        int tahunNow = java.time.Year.now().getValue();
        int age = tahunNow - tahunLahir;
        return age;
    }

    private String convert(String birthday) {

        return birthday; 
    }
}
