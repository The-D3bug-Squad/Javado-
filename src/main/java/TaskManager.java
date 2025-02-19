
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
        try{
            File file = new File("tasks.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",");
                Task task = new Task(line[0], line[1], Boolean.valueOf(line[2]));
                this.tasks.add(task);
            }
            scanner.close();
            file.delete();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public List<Task> listTasks(){
        return this.tasks;
    }

    public void markTaskAsComplete(Task task) {
        Task updatedTask = task.setStatus();
        this.tasks.set(this.tasks.indexOf(task), updatedTask);
    }

    public void processMenuChoice(int choice) {

    }

    public void deleteTask(Task task){
        int count = 0;
        for (Task t : this.tasks) {
            if (t == task) {
                count++;
            }
        }
        if (count == 1) {
            if (this.tasks.remove(task)) {
                System.out.println("Task deleted!");
            } else {
                System.out.println("Failed to delete task, please try again");
            }
        } else {
            throw new IllegalArgumentException("Task not found!");
        }
    }

    public void exit() {
        try{
            FileWriter fw = new FileWriter("tasks.txt");
            for (Task task : this.tasks) {
                String title = task.title;
                String description = task.description;
                boolean status = task.status;
                String line = title + "," + description + "," + status + "\n";
                fw.write(line);
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error while writing tasks");
        }
    }
}