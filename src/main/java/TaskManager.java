import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
        this.readTasks();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> listTasks() {
        return tasks;
    }

    public void deleteTask(String task){
//        tasks.re
    }

    public void exit() {
        // leave for iteration 2
        this.saveTasks();
    }
    public void readTasks(){
        String filePath = "data.csv";
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            
            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                tasks.add(data[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveTasks() {

        String filePath = "data.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            for (String task : tasks) {
                
                writer.write(String.join(",", task));
                writer.newLine();
            }

            System.out.println("CSV file created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
