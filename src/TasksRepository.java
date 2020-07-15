import java.util.ArrayList;
import java.util.List;

public class TasksRepository implements ITasksRepository {
    private Cache cache;
    private IFileStorageManager fileStorageManager = new FileStorageManager();

    public TasksRepository(Cache cache) {
        this.cache = cache;
    }

    @Override
    public List<String> getTasks() {
        if (cache.hasTasks()) {
            return cache.getTasks();
        } else {
            List<String> tasks = fileStorageManager.getData();
            cache.saveTasks(tasks);
            return tasks;
        }
    }

    @Override
    public String getTask(String taskId) {
        return null;
    }

    @Override
    public void addTask(String task) {
        cache.addTask(task);
    }

    @Override
    public void deleteTask(int taskId) {
        List<String> tasks = cache.getTasks();
        tasks.remove(taskId);
        //TODO why this method is redundant?
        cache.saveTasks(tasks);
    }

    @Override
    public void deleteAllTasks() {
        cache.saveTasks(new ArrayList<>());
    }

    @Override
    public void saveTasks() {
        fileStorageManager.saveData(cache.getTasks());
    }
}
