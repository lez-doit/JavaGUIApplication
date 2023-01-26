import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevent from resizing
        frame.setSize(600, 600);
        frame.setVisible(true); //making frame visible

        ImageIcon image = new ImageIcon("icon.png");
        frame.setIconImage(image.getImage()); //added logo
    }
}