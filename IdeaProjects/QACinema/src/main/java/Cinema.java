import javax.swing.*;
import java.awt.*;

public class Cinema {

    public Cinema() {

        JFrame f = new JFrame("QA Cinema");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();

        f.setLayout(new GridLayout(6,1));

        JLabel l1 = new JLabel("Standard (£8)");
        JLabel l2 = new JLabel("OAP (£6)");
        JLabel l3 = new JLabel("Student(£6)");
        JLabel l4 = new JLabel("Child (£4)");
        JLabel l5 = new JLabel("Total Amount: ");
        JLabel l6 = new JLabel();

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);
        JTextField t4 = new JTextField(10);

        JButton b1 = new JButton("Submit");

        Calculation cal = new Calculation(t1,t2,t3,t4,l6);
        b1.addActionListener(cal);

        p1.add(l1);
        p1.add(t1);

        p2.add(l2);
        p2.add(t2);

        p3.add(l3);
        p3.add(t3);

        p4.add(l4);
        p4.add(t4);

        p5.add(l5);
        p5.add(l6);

        p6.add(b1);

        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);
        f.add(p6);

        f.setSize(500,500);
        f.setVisible(true);
    }
}
