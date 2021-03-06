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
    public void deleteTask(String taskId) throws Exception {
        throw new Exception("method is not implemented");
    }

    @Override
    public void saveTasks() {
        fileStorageManager.saveData(cache.getTasks());
    }
}
