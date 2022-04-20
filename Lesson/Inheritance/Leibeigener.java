public class Leibeigener extends Bauer{
    @Override
    public int zuVersteuerndesEinkommen() {
        int zuVersteuerndesEinkommen = einkommen - 12;
        if(zuVersteuerndesEinkommen < 0) zuVersteuerndesEinkommen = 0;
        return zuVersteuerndesEinkommen;
    }
}
