import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Huyas implements ActionListener {
    File file = new File("daun.txt");
    Scanner scan = new Scanner(file);
    private int count =0;
    private JLabel jLabel;
    private JFrame frameTamer;
    private JPanel jopaNela;
    public Huyas() throws FileNotFoundException {
        JButton button = new JButton("Я підор");
        button.addActionListener(this);
        jLabel = new JLabel("Ступінь мого опідореня: "+count);

        frameTamer = new JFrame();
        jopaNela = new JPanel();
        jopaNela.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        jopaNela.setLayout(new GridLayout(0, 1));
        jopaNela.add(button);
        jopaNela.add(jLabel);
        frameTamer.add(jopaNela, BorderLayout.CENTER);
        frameTamer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameTamer.setTitle("Cal w ingalator");
        frameTamer.pack();
        frameTamer.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         count++;
        jLabel.setText("Ступінь мого опідореня: "+count);
    }
}