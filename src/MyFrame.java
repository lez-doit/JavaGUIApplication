import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JTextField textField1;

    JLabel label1, label2, label3, label4, label5;
    JButton button;

    JRadioButton radioC1, radioF1, radioK1, radioC2, radioF2, radioK2;
    MyFrame(){
        this.setTitle("Temperature Convertor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setSize(600, 170);
        this.setResizable(false);
        this.setLayout(null);

        ImageIcon image = new ImageIcon("icon.png");
        this.setIconImage(image.getImage()); //added logo
        this.getContentPane().setBackground(Color.lightGray); //changed bg color

        //Label

        label1 = new JLabel("Celsius to Fahrenheit");
        label1.setBounds(25, 25, 200, 25);
        label1.setFont(new Font("Consolas", Font.PLAIN, 15));

        label2 = new JLabel("°C");
        label2.setBounds(110, 50, 25, 25);
        label2.setFont(new Font("Consolas", Font.PLAIN, 15));

        label3 = new JLabel(" = 32°F");
        label3.setBounds(140, 50, 100, 25);
        label3.setFont(new Font("Consolas", Font.PLAIN, 15));

        label4 = new JLabel("Converting from");
        label4.setBounds(270, 25, 200, 25);
        label4.setFont(new Font("Consolas", Font.PLAIN, 15));

        label5 = new JLabel("Converting to");
        label5.setBounds(430, 25, 200, 25);
        label5.setFont(new Font("Consolas", Font.PLAIN, 15));

        //TextField

        textField1 = new JTextField("0.0");
        textField1.setBounds(25, 50, 80, 25);
        textField1.setFont(new Font("Consolas", Font.PLAIN, 15));

        //Button

        button = new JButton("Convert");
        button.setBounds(25, 80, 120, 25);
        button.setFont(new Font("Consolas", Font.PLAIN, 15));
        button.setFocusable(false);

        //RadioButton

        radioC1 = new JRadioButton("°C");
        radioC1.setBounds(270, 50, 45, 25);
        radioC1.setFont(new Font("Consolas", Font.PLAIN, 15));
        radioC1.setFocusable(false);
        radioC1.setOpaque(false);

        radioF1 = new JRadioButton("°F");
        radioF1.setBounds(315, 50, 45, 25);
        radioF1.setFont(new Font("Consolas", Font.PLAIN, 15));
        radioF1.setFocusable(false);
        radioF1.setOpaque(false);

        radioK1 = new JRadioButton("°K");
        radioK1.setBounds(360, 50, 45, 25);
        radioK1.setFont(new Font("Consolas", Font.PLAIN, 15));
        radioK1.setFocusable(false);
        radioK1.setOpaque(false);

        radioC2 = new JRadioButton("°C");
        radioC2.setBounds(430, 50, 45, 25);
        radioC2.setFont(new Font("Consolas", Font.PLAIN, 15));
        radioC2.setFocusable(false);
        radioC2.setOpaque(false);

        radioF2 = new JRadioButton("°F");
        radioF2.setBounds(475, 50, 45, 25);
        radioF2.setFont(new Font("Consolas", Font.PLAIN, 15));
        radioF2.setFocusable(false);
        radioF2.setOpaque(false);

        radioK2 = new JRadioButton("°K");
        radioK2.setBounds(520, 50, 45, 25);
        radioK2.setFont(new Font("Consolas", Font.PLAIN, 15));
        radioK2.setFocusable(false);
        radioK2.setOpaque(false);

        ButtonGroup groupFrom = new ButtonGroup();
        groupFrom.add(radioC1);
        groupFrom.add(radioF1);
        groupFrom.add(radioK1);
        this.add(label1);

        ButtonGroup groupTo = new ButtonGroup();
        groupTo.add(radioC2);
        groupTo.add(radioF2);
        groupTo.add(radioK2);

        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
        this.add(textField1);
        this.add(button);
        this.add(radioC1);
        this.add(radioF1);
        this.add(radioK1);
        this.add(radioC2);
        this.add(radioF2);
        this.add(radioK2);
        this.setVisible(true); //making this visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
