import java.util.List;

public class ShowTasksManager {
    private ITasksRepository repository;

    public ShowTasksManager(ITasksRepository repository) {
        this.repository = repository;
    }

    public void showTasks(){
        System.out.println("This is your tasks");
        List<String> listTasks;
        listTasks = repository.getTasks();
        for (int i = 0; i< listTasks.size(); i++){
            System.out.println(getItemText(listTasks, i));
        }
    }

    private String getItemText(List<String> listTasks, int i) {
        return (i + 1)  + ". " + listTasks.get(i);
    }
}
