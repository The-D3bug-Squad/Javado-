import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import  java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TaskManager {
    List<String> tasks; // hint: will change in iteration 3
    final String nameOfFile = "tasks.csv";
    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
        try {
            File file = new File(nameOfFile);
            Scanner scanner =new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                tasks.add(line);
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

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public List<String> listTasks() {
        return tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        try {
            FileWriter writer = new FileWriter(nameOfFile);
            for (String task : tasks) {
                writer.write(task+"\n");

            }

            writer.close();
        }catch (IOException e){
            System.out.println("Error writing file .csv");
        }
//        Runtime.getRuntime().halt(0);
    }
}
