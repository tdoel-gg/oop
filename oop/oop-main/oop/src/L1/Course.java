package L1;

public class Course {
    private final String language;
    private final int number;
    public Course(String language, int number) {
        this.language = language;
        this.number = number;
    }
    public String getLanguage() {
        return language;
    }

    public int getNumber() {
        return number;
    }
}
