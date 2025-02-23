public class Task {
//    leave empty this is for iteration 3
    private String title;
    private String description;
    public Boolean isComplete;

    public Task(String title, String description, Boolean isCompleted){
        this.title = title;
        this.description = description;
        this.isComplete = isCompleted;
    }
    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public Boolean isComplete(){
        return isComplete;
    }
}

//What does the final keyword mean in java?
//Typecasting to Java? Specifically from string to boolean
//String Value of Method/ Boolean Value of Method
//The method for removing an item in a Java List
/*How to delete and item
1. Finding the object
2. Removing the object
3. I might need a for loop
* */