import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    private EventListener listener;
    private JLabel label = new JLabel(" Choose an action");
    private JButton btnAddTask = new JButton("Add task");
    private JButton btnShowTasks = new JButton("View list of tack");
    private JButton btmDeleteTask = new JButton("Delete");

    public Gui(EventListener listener) {
        super("Task");
        this.listener = listener;
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAddTask.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAddTask.setPreferredSize(new Dimension(1000,2000));
        btnAddTask.addActionListener(new ActionListener() {
                                         @Override
                                         public void actionPerformed(ActionEvent arg0) {
                                            listener.onButtonClick("Create Task");
                                         }
                                     });
        btnShowTasks.setAlignmentX(Component.CENTER_ALIGNMENT);
        btmDeleteTask.setAlignmentX(Component.CENTER_ALIGNMENT);

        Container container = this.getContentPane();

        BoxLayout boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(boxLayout);
        container.add(label);
        container.add(btnAddTask);
        container.add(btnShowTasks);
        container.add(btmDeleteTask);

    }

}

