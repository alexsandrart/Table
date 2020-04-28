import java.util.Scanner;

public class AddTaskManager {
    private Scanner scanner = new Scanner(System.in);

    public void addTask(NewTaskListener listener) {
        System.out.println("Write down your task:");
        String newTask = scanner.nextLine();
        listener.onNewTask(newTask);
    }
}
