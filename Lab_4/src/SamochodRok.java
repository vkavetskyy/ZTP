public class SamochodRok {
    private int rok;

    public SamochodRok(int rok) {
        this.rok = rok;
    }

    public int getRok() {
        return rok;
    }

    @Override
    public String toString() {
        return rok + "";
    }
}
