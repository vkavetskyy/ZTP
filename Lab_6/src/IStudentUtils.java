public interface IStudentUtils {
    default void help() {
        System.out.println("\nStudent jest zapisany na kursy i studiuje na wydziale." + helpUtils());
    }

    private String helpUtils() {
        return "\nTa klasa zawiera różne funkcje do obsługi klasy studentów";
    }
}
