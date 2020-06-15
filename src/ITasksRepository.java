import java.util.List;

 interface ITasksRepository {
    List<String> getTasks();
    String getTask(String taskId);
    void addTask(String task);
    void deleteTask(String taskId) throws Exception;
}
