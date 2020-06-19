import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileStorageManager implements IFileStorageManager{
    private File file = new File("storage.txt");

    @Override
    public void saveData(List<String> tasks) {
        try {
            FileWriter fileWriter = new FileWriter(file);

            for (String task: tasks) {
                fileWriter.write(task);
                fileWriter.write("\n");
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> getData() {
        createIfNotExist();

        List<String> tasks = new ArrayList<>();

        try {
            Scanner scanner= new Scanner(file);
            while (scanner.hasNext()) {
                String task = scanner.nextLine();
                tasks.add(task);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    private void createIfNotExist() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
