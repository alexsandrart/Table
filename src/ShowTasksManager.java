public class ShowTasksManager {
    private ITasksRepository repository;

    public ShowTasksManager(ITasksRepository repository) {
        this.repository = repository;
    }

    public void showTasks(){
        System.out.println("This is your tasks");
        repository.getTasks().forEach(System.out::println);
    }
}
