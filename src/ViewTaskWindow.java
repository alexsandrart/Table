import javax.swing.*;
import java.awt.*;

public class ViewTaskWindow extends JFrame {
    private EventListener commandListener;
    private JButton btnBack = new JButton("Back");

    public ViewTaskWindow(EventListener listener) {
        super("ViewTask");
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.commandListener = listener;

        btnBack.setAlignmentY(Component.CENTER_ALIGNMENT);
        btnBack.addActionListener(actionEvent -> commandListener.onButtonClick(ButtonClickEvent.BACK_TO_MAIN_MENU));

        Container container = this.getContentPane();

        BoxLayout boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(boxLayout);
        container.add(btnBack);

    }
}
