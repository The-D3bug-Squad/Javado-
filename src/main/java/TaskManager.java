import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {

        tasks.add(task);



    }

    public List<String> listTasks() {

        return tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2
    }
}