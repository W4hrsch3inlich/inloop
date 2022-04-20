public class Einwohner {
    protected int einkommen;

    public int zuVersteuerndesEinkommen() {
        return einkommen;
    }

    public int steuer() {
        int steuer = (int)(zuVersteuerndesEinkommen() * 0.1);
        if(steuer < 1) return 1;
        return steuer;
    }

    public void setEinkommen(int einkommen) {
        if(einkommen < 0){
            throw new IllegalArgumentException();
        }
        else {
            this.einkommen = einkommen;
        }
    }
}
