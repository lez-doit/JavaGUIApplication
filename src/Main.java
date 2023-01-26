import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

        JLabel label = new JLabel();
        label.setText("This is text of label"); //set text of label
        myFrame.add(label);

        ImageIcon image1 = new ImageIcon("image1.png");
        label.setIcon(image1);

        Border border = BorderFactory.createLineBorder(Color.green);

        label.setHorizontalTextPosition(JLabel.CENTER); //set position relative to image
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.DARK_GRAY); //set font color
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font
        label.setBackground(Color.WHITE);
        label.setOpaque(true); //display bg color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set position of label contents
        label.setHorizontalAlignment(JLabel.CENTER);
    }
}