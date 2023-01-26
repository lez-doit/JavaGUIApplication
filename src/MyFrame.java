import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame Title");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setSize(600, 600);
        this.setVisible(true); //making this visible

        ImageIcon image = new ImageIcon("icon.png");
        this.setIconImage(image.getImage()); //added logo
        this.getContentPane().setBackground(Color.lightGray); //changed bg color
    }
}
