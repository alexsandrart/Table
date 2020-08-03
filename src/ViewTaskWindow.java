import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewTaskWindow extends JFrame {
    private EventListener commandListener;
    private JButton btnBack = new JButton("Back");

    public ViewTaskWindow(EventListener listener) {
        super("ViewTask");
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.commandListener = listener;

        btnBack.setAlignmentY(Component.CENTER_ALIGNMENT);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                commandListener.onButtonClick(ButtonClickEvent.BACK_TO_MAIN_MENU);
            }
        });

        Container container = this.getContentPane();

        BoxLayout boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(boxLayout);
        container.add(btnBack);

    }
}
