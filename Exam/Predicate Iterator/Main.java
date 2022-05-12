public class Main {
    public static void main(String[] args) {
        Predicate<String> lengthIsTwo = new HasLength(2);
        System.out.println(lengthIsTwo.test("ab"));  // prints true

        Predicate<String> endsWithTxt = new EndsWith(".txt");
        System.out.println(endsWithTxt.test("Predicate.java"));  // prints false
    }
}
