import java.util.*;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager()
    {
        this.tasks = new ArrayList<>(List.of());
//        String[] newlist = {};  this is what i know
    };

    public void addTask(String task)
    {
        this.tasks.add(task);
    }

    public List<String> listTasks()
    {
        return tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2
    }
}