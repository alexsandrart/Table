import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTaskWindow extends JFrame {
    private EventListener eventListener;
    private ITasksRepository repository;
    private JLabel label = new JLabel("Enter your task");
    private JButton btnSave = new JButton("Save Task");
    private JButton btnBack = new JButton("Back");
    private JTextField textField = new JTextField();
    private Container container = this.getContentPane();

    public AddTaskWindow(EventListener listener, ITasksRepository tasksRepository) {
        super("Add Task Window");
        this.eventListener = listener;
        repository = tasksRepository;
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoxLayout boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(boxLayout);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                eventListener.onButtonClick(ButtonClickEvent.BACK_TO_MAIN_MENU);
            }
        });
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                saveTask();
                eventListener.onButtonClick(ButtonClickEvent.BACK_TO_MAIN_MENU);
            }
        });
        container.add(label);
        container.add(textField);
        container.add(btnSave);
        container.add(btnBack);

    }

    private void saveTask() {
        String task = textField.getText();
        repository.addTask(task);
    }
}
