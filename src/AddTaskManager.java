import java.util.Scanner;

public class AddTaskManager {
    private Scanner scanner = new Scanner(System.in);
    private NewTaskListener listener;

    public AddTaskManager(NewTaskListener listener) {
        this.listener = listener;
    }

    public void addTask() {
        System.out.println("Write down your task:");
        String newTask = scanner.nextLine();
        listener.onNewTask(newTask);
    }
}
