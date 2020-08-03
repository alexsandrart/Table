import java.util.Scanner;

public class Application implements EventListener {
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
        application.startMainMenuWindow();
    }

    private void startMainMenuWindow() {
        MainMenuWindow mainMenuWindow = new MainMenuWindow(this);
        mainMenuWindow.setVisible(true);
    }

    @Override
    public void onButtonClick(ButtonClickEvent event) {
        switch (event) {
            case OPEN_ADD_TASK_WINDOW:
                openCreateTaskWindow();
                break;
            case OPEN_VIEW_TASK_WINDOW:
                openViewTaskWindow();
                break;
            case BACK_TO_MAIN_MENU:
                startMainMenuWindow();
                break;
        }

        if (event.equals("Create Task")) {
            openCreateTaskWindow();
        }
    }

    private void openViewTaskWindow() {
        ViewTaskWindow viewTaskWindow = new ViewTaskWindow(this);
        viewTaskWindow.setVisible(true);
    }

    private void openCreateTaskWindow() {
        CreateTaskWindow createTaskWindow = new CreateTaskWindow(this);
        createTaskWindow.setVisible(true);
    }

}