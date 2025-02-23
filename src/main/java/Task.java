public class Task {
//    leave empty this is for iteration 3
    String title_1 ;
    String description_1;
    boolean complete_1;

    public Task(String title,String description,boolean complete){
        title_1 = title;
        description_1 = description;
        complete_1 = complete;
    }
    public String getTitle(){
        return title_1;
    }
    public String getDescription(){
        return description_1;
    }
    public boolean isComplete(){
        return complete_1;
    }
}
