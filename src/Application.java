import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    //TODO Когда создаётся переменная scanner?

    //TODO Убрать ui элементы из Application
    //TODO Добавить гуи
    //TODO Добавить удаление задачи

    private ITasksRepository repository = new TasksRepository(new Cache());
    private Scanner scanner = new Scanner(System.in);
    private AddTaskManager addTaskManager = new AddTaskManager(repository);
    private ShowTasksManager showTasksManager = new ShowTasksManager(repository);

    public static void main(String[] args) {
        Application application = new Application();
        application.startMainWindow();
    }

    private void startMainWindow() {
        while (true) {
            printMainMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    addTaskManager.addTask();
                    break;
                case 2:
                    showTasksManager.showTasks();
                    break;
                case 0:
                    repository.saveTasks();
                    System.out.println("Good buy");
                    return;
                default:
                    System.out.println("You entered wrong number. Try again");
            }
        }
    }

    private void printMainMenu() {
        System.out.println("Make your choice ");
        System.out.println("1 - add task");
        System.out.println("2 - view list of tack");
        System.out.println("0 - to exit application");
    }

    private int getUserChoice() {
        return scanner.nextInt();
    }
}