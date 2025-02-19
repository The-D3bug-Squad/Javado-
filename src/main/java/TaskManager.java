import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks; // hint: will change in iteration 3
    private final File tasksFile;

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<Task>();
        tasksFile = new File("tasks.csv");

        if (!tasksFile.exists()) {
            try {
                tasksFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        this.readTasks();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> listTasks() {
        return tasks;
    }

    public void deleteTask(Task task){

        boolean found = false;
     for (Task t : tasks) {

         if (task.equals(t)) {
             found = true;
             break;
         }

     }
     if (!found) {
         throw new IllegalArgumentException("Task not found!");
     }else {
         tasks.remove(task);
     }


    }

    public void exit() {
        // leave for iteration 2
        this.saveTasks();
    }
    public void readTasks() {
        String line;

        try {
            assert this.tasksFile != null;
            try (BufferedReader reader = new BufferedReader(new FileReader(this.tasksFile.getPath()))) {

                while ((line = reader.readLine()) != null) {
                    String title = line.split(",")[0];
                    String description = line.split(",")[1];
                    boolean status = Boolean.parseBoolean(line.split(",")[2]);
                    Task task = new Task(title, description, status);
                    tasks.add(task);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveTasks() {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.tasksFile.getPath()))) {

            for (Task task : tasks) {

                writer.write(task.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void markTaskAsComplete(Task task) {
        for (Task task2 : tasks) {
            if (task.equals(task2)) {
                task2.setStatus(true);
                System.out.println("Marked task as complete");
            }
        }
    }

    public int processMenuChoice(int i) {
        if (i < 0 | i > 5) {
            throw new IllegalArgumentException("Invalid menu option!");
        }
        else {
            return i;
        }
    }
}
