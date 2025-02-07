import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import  java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
        try {
            File file = new File("Tasks.txt");
            Scanner scanner =new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                tasks.add(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");

        }

    }

    public void addTask(String task) {
       // throw new UnsupportedOperationException("Implement this method!");
        this.tasks.add(task);
    }

    public List<String> listTasks() {
        //throw new UnsupportedOperationException("Implement this method!");
        return tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        try {
            FileWriter writer = new FileWriter("Tasks.txt");
            for (String task : tasks) {
                writer.write(task+"\n");

            }

            writer.close();
        }catch (IOException e){
            System.out.println("Error writing file .txt");
        }
//        Runtime.getRuntime().halt(0);
    }
}
