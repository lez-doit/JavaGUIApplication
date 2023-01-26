import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

        JLabel label = new JLabel();
        label.setText("This is text of label"); //set text of label
        myFrame.add(label);
        ImageIcon image1 = new ImageIcon("image1.png");
        label.setIcon(image1);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
    }
}