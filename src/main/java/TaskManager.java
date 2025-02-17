import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.nio.file.*;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3
    private static final String FILENAME = "tasks.csv";

    public TaskManager() {
        // Initialize tasks list
        this.tasks = new ArrayList<>();
        loadTasksFromFile();
        createFileIfNotExists();
    }

    public void addTask(String task) {
        //throw new UnsupportedOperationException("Implement this method!");
    this.tasks.add(task);
    }

    public List<String> listTasks() {
        //throw new UnsupportedOperationException("Implement this method!");
        return this.tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        saveTasksToFile();
    }

    private void createFileIfNotExists() {
        try{
            File file = new File(FILENAME);
            if(!file.exists()){
                if(file.createNewFile()){
                    System.out.println("File created: " + FILENAME);
                }

            }
        }catch(Exception e){
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    private void loadTasksFromFile() {
        try {
            Path path = Paths.get(FILENAME);
            if (!Files.exists(path)) {
                tasks = Files.readAllLines(path);
            }

        }
        catch (IOException e) {
            System.out.println("Error loading tasks from file: " + e.getMessage());
        }
    }
    private void saveTasksToFile() {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))){
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
        }catch (IOException e) {
            System.out.println("Error saving tasks to file: " + e.getMessage());
        }
    }
}