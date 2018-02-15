import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Calculation implements ActionListener {
    int answer;
    int s, o, st, c;
    private JTextField tt1, tt2, tt3, tt4;
    private JLabel tt5;

    public Calculation(JTextField t1, JTextField t2, JTextField t3, JTextField t4 ,JLabel t5){
     tt5 = t5;
     tt1 = t1;
     tt2 = t2;
     tt3 = t3;
     tt4 = t4;
    }

    public void actionPerformed (ActionEvent x) {

        try {
            if (tt1.getText().equalsIgnoreCase("")) {
                s = 0;
            } else {
                s = Integer.parseInt(tt1.getText());
            }
            if (tt2.getText().equalsIgnoreCase("")) {
                o = 0;
            } else {
                o = Integer.parseInt(tt2.getText());
            }
            if (tt3.getText().equalsIgnoreCase("")) {
                st = 0;
            } else {
                st = Integer.parseInt(tt3.getText());
            }
            if (tt4.getText().equalsIgnoreCase("")) {
                c = 0;
            } else {
                c = Integer.parseInt(tt4.getText());
            }

            answer = (s * 8) + (o * 6) + (st * 6) + (c * 4);

            Calendar cal = Calendar.getInstance();
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
                answer = answer - 2;
            }

            tt5.setText(Integer.toString(answer));
        }
        catch (NumberFormatException e) {
            System.out.println("Exception : " + e);

            JOptionPane.showMessageDialog(null, "Please Only Enter Numbers");
            tt1.setText("");
            tt2.setText("");
            tt3.setText("");
            tt4.setText("");
        }
    }
}
