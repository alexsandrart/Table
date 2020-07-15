import java.util.Scanner;

public class DeleteTaskManager {
    TasksRepository repository;


    public void deleteAllTasks(){
        repository.deleteAllTasks();
    }

    public void deleteTasks(){
        System.out.println("enter number of task to be deleted:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        repository.deleteTask(number -1);
    }
}
