import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TaskManager {
    List<Task> tasks; // hint: will change in iteration 3
    final String nameOfFile = "tasks.csv";
    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
        try {
            File file = new File(nameOfFile);
            Scanner scanner =new Scanner(file);
            if (scanner.hasNextLine()){String bin = scanner.nextLine();}

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] taskDetails = line.split(",");
                String isComplete_s = taskDetails[2];
                boolean isComplete = isComplete_s.equals("true");

                tasks.add(new Task(taskDetails[0],taskDetails[1].substring(2,taskDetails[1].length()-1),isComplete));
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");

        }
        try {
            FileWriter writer = new FileWriter(nameOfFile);
            writer.close();
        }catch (IOException e){
            System.out.println("error creating .csv");
        }

    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public List<Task> listTasks() {
        return tasks;
    }

    public void deleteTask(Task task){
        tasks.remove(task);
    }

    public void exit() {
        try {
            FileWriter writer = new FileWriter(nameOfFile);
            writer.write("TaskTitle, TaskDetails, IsTaskComplete");
            for (Task task : tasks) {
                writer.write("\n"+task.getTitle()+", ");
                writer.write("\""+task.getDescription()+"\", ");
                String completeStatus = "false";
                if (task.isComplete()){
                    completeStatus = "true";
                }
                writer.write(completeStatus);

            }

            writer.close();
        }catch (IOException e){
            System.out.println("Error writing file .csv");
        }

//        Runtime.getRuntime().halt(0);
    }

    public void markTaskAsComplete(Task task){
        task.complete_1 = true;
    }
    public void processMenuChoice(int choice_number){
        if (choice_number<1 | choice_number >5){
            throw new IllegalArgumentException("Invalid menu option!");
        }
    }
}
