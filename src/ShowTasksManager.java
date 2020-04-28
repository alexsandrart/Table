import java.util.List;

public class ShowTasksManager {
    public void showTasks(List<String> tasks){
        System.out.println("This is your tasks");
        tasks.forEach(System.out::println);
    }
}
