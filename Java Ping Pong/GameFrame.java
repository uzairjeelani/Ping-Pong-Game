import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {

    GamePanel panel = new GamePanel();  // instance of GamePanel class
    
    GameFrame() {  // this is a constructor
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); // this makes it appear in the middle of the screen

    }
}
