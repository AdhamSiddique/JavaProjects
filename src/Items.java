import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class items {
    private String name;
    private LocalDateTime createdAt;

    public items(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now(); // Initialize with current date and time
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return name + " (created at: " + createdAt.format(formatter) + ")";
    }
}
