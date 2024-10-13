package L1;

public class Education {
    private final String name;
    private final String direction;

    public Education(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    public String info() {
        return name + " " + direction;
    }
}
