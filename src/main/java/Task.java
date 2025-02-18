public class Task {
//    leave empty this is for iteration 3
    String Title;
    String Description;
    boolean Expresion;

    public Task(String Title, String Description, boolean Expression){
//        static void getTitle(String tileValue) {
//            System.out.println(fname + " Refsnes");
//            }
        this.Title = Title;
        this.Description = Description;
        this.Expresion = Expression;
//        getTitle = Title;
//        getDescription = Description;
//        Statement = Expression;
    }

    public static String getTitle(){
        Task task = new Task("Buy groceries", "Get milk, eggs, and bread", false);
//        System.out.println(task.getTitle());
        return task.Title;
    }

    public static String getDescription(){
        Task task = new Task("Buy groceries", "Get milk, eggs, and bread", false);
//        System.out.println(task.getDescription());
        return task.Description;
    }

//    public static boolean isComplete(){
//        Task task = new Task("Buy groceries", "Get milk, eggs, and bread", false);
////        System.out.println(task.getExpresion());
//        return task.Expresion;
//    }
    }
