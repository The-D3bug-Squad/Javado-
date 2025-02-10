import java.util.List;
import java.util.ArrayList;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(File_name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error while loading tasks: " + e.getMessage());
        }
    }

    public void addTask(String task) {
       // throw new UnsupportedOperationException("Implement this method!");
        tasks.add(task);
        exit();
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
        System.exit(0);
         try (BufferedWriter writer = new BufferedWriter(new FileWriter(File_name))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
        }catch (IOException e){
            System.err.println("Error while saving tasks: " + e.getMessage());
        }
    }
}
