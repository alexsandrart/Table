import java.util.Scanner;

public class MainWindow {
    //TODO Create class for adding task to list
    //TODO Create class for showing list
    //TODO Use listener interface
    //TODO Когда создаётся переменная scanner?
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.startMainWindow();
    }

    private void startMainWindow(){
        System.out.println("Make your choice ");
        System.out.println("1 - add task");
        System.out.println("2 - view list of tack");
        System.out.println("0 - to exit application");

        while (true) {
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    System.out.println("navigate to add task");
                    break;
                case 2:
                    System.out.println("navigate to task list");
                    break;
                case 0:
                    System.out.println("Good buy");
                    return;
                default:
                    System.out.println("You entered wrong number. Try again");
            }
        }
    }

    private int getUserChoice() {
        return scanner.nextInt();
    }
}
