import javax.swing.*;

public class CreateTaskWindow extends JFrame {
    private EventListener listener;
    private JLabel label = new JLabel(" Choose an action");

    public CreateTaskWindow(EventListener listener) {
        super("Create Task Window");
        this.listener = listener;
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
