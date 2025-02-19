public class Task
{
//    leave empty this is for iteration 3

    private String title;
    private String description;
    private boolean isComplete = false;

    public Task(String title, String description, boolean isComplete)
    {
        this.title = title;
        this.description = description;
        this.isComplete = isComplete;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean isComplete()
    {
        return this.isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
