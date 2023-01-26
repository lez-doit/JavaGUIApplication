import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

        //Label

        JLabel label = new JLabel();
        label.setText("This is text of label"); //set text of label

        ImageIcon image1 = new ImageIcon("image1.png");
        label.setIcon(image1);

        Border border = BorderFactory.createLineBorder(Color.green, 2); //creating border for label

        label.setHorizontalTextPosition(JLabel.CENTER); //set position relative to image
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.DARK_GRAY); //set font color
        label.setFont(new Font("Comic Sans", Font.PLAIN, 20)); //set font
        //label.setBackground(Color.WHITE);
        //label.setOpaque(true); //display bg color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP); //set position of label contents
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0, 0 , 200, 200); //set x|y positions for label as well as dimensions
        //myFrame.pack(); resizes frame according to it`s components

        //JPanel

        JPanel panel = new JPanel();
        panel.setBackground(Color.white);

        panel.setLayout(new BorderLayout());
        panel.add(label);

        myFrame.add(panel);
        panel.setBounds(0, 0, 300, 300);
        myFrame.setLayout(null);

        myFrame.setVisible(true);
    }
}