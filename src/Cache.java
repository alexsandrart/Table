import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<String> tasks = new ArrayList<>();

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task){
        tasks.add(task);
    }

    public boolean hasTasks() {
        return tasks.size() > 0;
    }

    public void saveTasks(List<String> tasks){
       this.tasks.addAll(tasks);
    }
}
