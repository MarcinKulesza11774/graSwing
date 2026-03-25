import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame{
    private JPanel ContentPane;
    private JButton backToMenu;

    Settings(StartMenu startMenu){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(ContentPane);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setSize(new Dimension(1920, 1080));

        setUndecorated(true);
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));

        backToMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startMenu.setVisible(true);
                setVisible(false);
            }
        });

        pack();
        setVisible(true);
    }
}
