import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3
    private final String fileName = "tasks.csv";

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
        File tasksFile = new File(fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            if (!tasksFile.exists()){
                try{
                    tasksFile.createNewFile();
                } catch (IOException ex) {
                    System.err.println("Error While creating the file: " +ex.getMessage());
                }
            }
        }
    }

    public void addTask(String task) {
       // throw new UnsupportedOperationException("Implement this method!");
        tasks.add(task);
    }

    public List<String> listTasks() {
        //throw new UnsupportedOperationException("Implement this method!");
        return tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2
        System.out.println("Tasks saved. Exiting..." );
         try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
        }catch (IOException e){
            System.err.println("Error while saving tasks: " + e.getMessage());
        }
    }
}
