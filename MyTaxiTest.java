public class MyTaxiTest {
    public static void main(String[] args) {
        Human juergen = new Human("Juergen", "Staub");

        Human andrea = new Human("Andrea", "Bora");
        Human franzi = new Human("Franzi", "Ada");
        Human leah = new Human("Leah", "Posh");
        Human susi = new Human("Susi", "Fresh");
        Human lucky = new Human("Lucky", "Fuke");

        Taxi taxi = new Taxi(juergen);

        taxi.add(andrea);
        taxi.add(franzi);
        taxi.add(leah);
        taxi.add(susi);
        taxi.add(lucky);

        System.out.println(taxi);

        Human[] oldPassengers = taxi.allGetOut();
        System.out.println(taxi);

        for(Human passenger : oldPassengers){
            taxi.add(passenger);
            System.out.println(taxi);
        }
    }
}
