public class Task {
    private String title;
    private String description;
    private boolean status;

    public Task(String title, String description, boolean status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isComplete() {
        return status;
    }

    @Override
    public String toString() {
        return this.title + "," + this.description + "," + this.status;
    }
}
