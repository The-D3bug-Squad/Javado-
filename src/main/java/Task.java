public class Task {
    String title;
    String description;
    boolean status;

    public Task(String title, String description, boolean status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isComplete() {
        return this.status;
    }

    public Task setStatus() {
        this.status = true;
        return this;
    }
}
