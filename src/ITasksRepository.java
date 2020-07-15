import java.util.List;

 interface ITasksRepository {
    List<String> getTasks();
    String getTask(String taskId);
    void addTask(String task);
    void saveTasks();
    void deleteTask(int taskId);
    void deleteAllTasks();
}
