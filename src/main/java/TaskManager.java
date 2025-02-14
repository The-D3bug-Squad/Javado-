import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        File file = new File("tasks.csv");
        FileWriter fr = null;
        boolean exists = file.exists();

        if (exists){
            System.out.println("here");
            tasks = (ReadTasks("tasks.csv"));

        }
        else {
            try {
                fr = new FileWriter(file);
                tasks = new ArrayList<>();

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    assert fr != null;
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }

            }

        }
    }

    public List<String> ReadTasks(String args) {
        try {
            List<String> data = new ArrayList<>();
            // replace with the path to your own CSV file
            File file = new File(args);
            Scanner s = new Scanner(file);

            while (s.hasNextLine()) {
                String lineData = s.nextLine();
                data.add(lineData);
                System.out.println(lineData);
            }

            s.close();
            return data;
        } catch (Exception e) {
            System.out.println(e);

        }
        return new ArrayList<>(tasks);
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> listTasks() {
//        return new ArrayList<>(tasks);
        if (tasks == null) {
            tasks = new ArrayList<>();
            System.out.println("The task list is currently empty. ");
        }
        System.out.println(tasks.size());

        for (String task : tasks) {

            System.out.println(task);
        }
        return new ArrayList<>(tasks);
    }

    public void deleteTask(String task) {
//        leave for iteration 4
    }

    public static void writeUsingFileWriter(List<String> data) {
        File file = new File("tasks.csv");
        FileWriter fr = null;

        try {
            fr = new FileWriter(file);
            for (String item : data) {
                String a = String.format("%s\n",  item);
                System.out.print(a);
                fr.write(a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fr != null;
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

    public void exit() {
        writeUsingFileWriter(tasks);
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.listTasks();


    }
}