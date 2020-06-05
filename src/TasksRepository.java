import java.util.List;

public class TasksRepository implements ITasksRepository{
    private Cache cache;

    public TasksRepository(Cache cache){
        this.cache = cache;
    }

    @Override
    public List<String> getTasks() {
        return cache.getTasks();
    }

    @Override
    public String getTask(String taskId) {
        return null;
    }

    @Override
    public void addTask(String task) {

    }

    @Override
    public void deleteTask(String taskId) {

    }
}
