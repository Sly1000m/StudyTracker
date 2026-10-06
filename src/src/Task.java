public class Task {
    private String course;
    private String title;
    private String deadline;
    private boolean completed;

    public Task(String course, String title, String deadline) {
        this.course = course;
        this.title = title;
        this.deadline = deadline;
        this.completed = false;
    }

    public String getCourse() {
        return course;
    }

    public String getTitle() {
        return title;
    }

    public String getDeadline() {
        return deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }
}
