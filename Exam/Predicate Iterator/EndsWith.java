public class EndsWith implements Predicate<String>{
    private String suffix;

    public EndsWith(String suffix) {
        if(suffix == null) throw new IllegalArgumentException();
        this.suffix = suffix;
    }

    public boolean test(String value) {
        if(value == null) return false;
        if(suffix.length() > value.length()) return false;
        for(int i = 1; i < suffix.length()+1; i++) {
            if(suffix.charAt(suffix.length()-i) != value.charAt(value.length()-i)) return false;
        }
        return true;
    }
}
