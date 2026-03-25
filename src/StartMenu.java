import javax.swing.*;
import java.awt.*;

public class StartMenu extends JFrame{
    private JPanel ContentPane;
    private JLabel Title;
    private JButton NewGame;
    private JButton Settings;
    private JButton Exit;

    StartMenu(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(ContentPane);
        setPreferredSize(new Dimension(1920, 1080));

        pack();
        setVisible(true);
    }
}
