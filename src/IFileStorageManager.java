import java.util.List;

interface IFileStorageManager {
    void saveData(List<String> tasks);
    List<String> getData();
}
