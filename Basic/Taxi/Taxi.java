public class Taxi {
    private Human driver;
    private Human[] passengers;
    private int numberOfPassengers;

    public Taxi(Human driver) {
        this.driver = driver;
        this.passengers = new Human[4];
        this.numberOfPassengers = 0;
    }

    public String getDriverName() {
        return driver.toString();
    }

    public void add(Human passenger) {
        if(numberOfPassengers == 4) System.out.println("We are sorry, " + passenger + ". The taxi is full.");
        else {
            System.out.println(passenger + " gets in.");
            passengers[numberOfPassengers] = passenger;
            numberOfPassengers++;
        }
    }

    @Override
    public String toString() {
        String message = "";
        message += "This is the taxi of " + driver + ". ";
        if(numberOfPassengers == 0) message += "He takes nobody along.";
        else {
            message += "He takes " + passengers[0];
            for(int i = 1; i < numberOfPassengers; i++) {
                if(i == numberOfPassengers - 1){
                    message += " and ";
                }
                else message += ", ";
                message += passengers[i];
            }
            message += " along.";
        }
        return message;
    }

    public Human[] allGetOut() {
        Human[] returnPassengers = new Human[numberOfPassengers];
        for(int i = 0; i < numberOfPassengers; i++) {
            returnPassengers[i] = passengers[i];
        }
        passengers = new Human[4];
        numberOfPassengers = 0;
        return returnPassengers;
    }
 }
