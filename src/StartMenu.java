import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartMenu extends JFrame{
    private JPanel ContentPane;
    private JLabel Title;
    private JButton NewGame;
    private JButton settings;
    private JButton Exit;

    StartMenu(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(ContentPane);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setSize(new Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
        Title.setPreferredSize(new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()), (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2));

        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        StartMenu startMenu = this;

        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Settings settings = new Settings(startMenu);
            }
        });

        pack();
        setVisible(true);
    }
}
