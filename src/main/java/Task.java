public class Task {
    //    leave empty this is for iteration 3
    private String lineData;

    public Task(String lineData) {
        this.lineData = lineData.trim();
    }


    public  String getLineData() {
        return lineData.trim();
    }

    @Override
    public String toString() {
        return lineData;
    }
}
