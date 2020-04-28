import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWindow implements NewTaskListener {
    //TODO Когда создаётся переменная scanner?
    private List<String> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private AddTaskManager addTaskManager = new AddTaskManager();
    private ShowTasksManager showTasksManager = new ShowTasksManager();

    public static void main(String[] args) {
        String s = "10";
        MainWindow mainWindow = new MainWindow();
        mainWindow.startMainWindow();
    }

    private void startMainWindow() {
        System.out.println("Make your choice ");
        System.out.println("1 - add task");
        System.out.println("2 - view list of tack");
        System.out.println("0 - to exit application");

        while (true) {
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    addTaskManager.addTask(this);
                    return;
                case 2:
                    showTasksManager.showTasks(tasks);
                    break;
                case 0:
                    System.out.println("Good buy");
                    return;
                default:
                    System.out.println("You entered wrong number. Try again");
            }
        }
    }

    private int getUserChoice() {
        return scanner.nextInt();
    }

    @Override
    public void onNewTask(String newTask) {
        tasks.add(newTask);
        tasks.forEach(System.out::println);
        startMainWindow();
    }
}
