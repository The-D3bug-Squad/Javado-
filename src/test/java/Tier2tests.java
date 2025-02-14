import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Tier2tests {
    private static final String TEST_FILE = "tasks.csv";  //assumes file is in root
    private TaskManager taskManager;

    @BeforeEach
    void setUp() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE)); // Ensure a clean start
        taskManager = new TaskManager(); // Initialize a fresh instance
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE)); // Cleanup after tests
    }

    @Test
    @DisplayName("File should be created when TaskManager is initialized")
    void testFileCreation() {
        File file = new File(TEST_FILE);
        assertTrue(file.exists(), "Task file should be created on initialization.");
    }

    @Test
    @DisplayName("Added tasks should persist in the file")
    void testTaskPersistence() throws IOException {
        taskManager.addTask("Buy Groceries");
        taskManager.addTask("Complete Assignment");
        taskManager.exit(); // Ensure tasks are saved to file

        List<String> lines = Files.readAllLines(Paths.get(TEST_FILE));
        assertEquals(2, lines.size(), "File should contain two tasks.");
        assertEquals("Buy Groceries", lines.get(0), "First task should match.");
        assertEquals("Complete Assignment", lines.get(1), "Second task should match.");
    }
}

