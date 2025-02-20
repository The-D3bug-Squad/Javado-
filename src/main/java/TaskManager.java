import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TaskManager {
    private List<Task> tasks; // hint: will change in iteration 3
    File csvFile = new File("tasks.csv");


    public TaskManager() {
        this.tasks = new ArrayList<>(List.of());
//        String[] newlist = {};  this is what i know

        File csvFile = new File("tasks.csv");
        try
        {
            csvFile.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
        }
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public List<Task> listTasks() {
        return this.tasks;
    }

    public void deleteTask(Task task) {
//        leave for iteration 4
        if (this.tasks.remove(task) == false )
        {
            throw new IllegalArgumentException("Task not found!");
        }
    }

    public void markTaskAsComplete(Task task)
    {
        if (this.tasks.contains(task))
        {
            task.setComplete(true);
        }
        else
        {
            System.out.println("Task does not exist");
        }
    }


    public void exit() {

        String filePath = "tasks.csv"; // File path where CSV will be saved

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Task row : this.tasks) {
                writer.write(String.join("," + row));
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public void processMenuChoice(Integer choice)
    {
        switch (choice)
        {
            case 1, 2, 3, 4:
                break;
            default:
                throw new IllegalArgumentException("Invalid menu option!");
        }
    }
}