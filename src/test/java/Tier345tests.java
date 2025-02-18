import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;


public class Tier345tests {
    private TaskManager taskManager;

    @BeforeEach
    void setUp() {
        taskManager = new TaskManager();
    }

    // ---- Tier 3

    @Test
    void testTaskObjectCreation() {
        Task task = new Task("Buy groceries", "Get milk, eggs, and bread", false);
        assertEquals("Buy groceries", task.getTitle());
        assertEquals("Get milk, eggs, and bread", task.getDescription());
        assertFalse(task.isComplete());
    }

    @Test
    void testAddTask() {
        taskManager.addTask(new Task("Study", "Prepare for the test", false));
        List<Task> tasks = taskManager.listTasks();
        assertEquals(1, tasks.size());
        assertEquals("Study", tasks.get(0).getTitle());
    }

    // ---- Tier 4

    @Test
    void testDeleteTask() {
        Task task = new Task("Workout", "Morning run", false);
        taskManager.addTask(task);
        assertEquals(1, taskManager.listTasks().size());

        taskManager.deleteTask(task);
        assertTrue(taskManager.listTasks().isEmpty());
    }

    @Test
    void testMarkTaskAsComplete() {
        Task task = new Task("Submit assignment", "CS project due", false);
        taskManager.addTask(task);
        taskManager.markTaskAsComplete(task);
        assertTrue(task.isComplete());
    }

    // ---- Tier 5

    @Test
    void testInvalidMenuInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            taskManager.processMenuChoice(99); // Invalid choice
        });
        assertEquals("Invalid menu option!", exception.getMessage());
    }

    @Test
    void testInvalidTaskDeletion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            taskManager.deleteTask(new Task("Non-existent", "This task is not in the list", false));
        });
        assertEquals("Task not found!", exception.getMessage());
    }
}
}
