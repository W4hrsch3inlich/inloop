package Lesson.Generics;

public class Wine extends Drink{
    private String region;

    public Beer(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return region;
    }
}
