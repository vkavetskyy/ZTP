public class Kurs {
    private final String nazwa;

    public Kurs(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
