import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    JLabel label;
    JFrame frame;
    JPanel panel;
    int liczba = 0;

    public GUI(){
        frame = new JFrame();
        panel = new JPanel();
        JButton button = new JButton("Kliknij zbrodniarzu");
        button.addActionListener((ActionListener) this);
        label = new JLabel("Liczba martwych bośniaków: 0");

        label.setForeground(Color.cyan);
        panel.setBorder(BorderFactory.createEmptyBorder(300, 150, 300 ,150));
        panel.setLayout(new GridLayout(0, 1));
        panel.setBackground(Color.DARK_GRAY);
        panel.setForeground(Color.CYAN);
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("OPEN GUI APP");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        liczba ++;
        label.setText("Liczba martwych bośniaków:" + liczba);
        System.out.println(liczba);
    }
}
