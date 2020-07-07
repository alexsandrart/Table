import java.util.Scanner;

public class AddTaskManager {
    private Scanner scanner = new Scanner(System.in);
    private ITasksRepository repository;

    public AddTaskManager(ITasksRepository iTasksRepository) {
        repository = iTasksRepository;
    }

    public void addTask() {
        System.out.println("Write down your task:");
        String newTask = scanner.nextLine();
        repository.addTask(newTask);
    }
}
