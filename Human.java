public class Human {
    private String forename, name;

    public Human(String forename, String name) {
        this.forename = forename;
        this.name = name;
    }

    public String getForename() {
        return forename;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return forename + " " + name;
    }
}