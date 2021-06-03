package ho10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht103 extends Applet {

    TextField tv1;
    Label l1;
    int d1;
    public void init() {

        setSize(800, 400);

        setBackground(Color.orange);

        tv1 = new TextField("");
        tv1.addActionListener(new maanden());
        add(tv1);

        l1 = new Label("Maand:  ");
        add(l1);

    }

    public void paint(Graphics g) {


        tv1.setLocation(100, 100);
        tv1.setSize(150, 40);

        l1.setLocation(100, 140);
        l1.setSize(150, 40);

    }

    class maanden implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("klik");

            String message;
            message = tv1.getText();
            d1 = Integer.parseInt(message);

            if (d1 == 1) {
                l1.setText("Januari Dagen: 31");
            }

            if (d1 == 2) {
                l1.setText("Februari Dagen: 28");
            }

            if (d1 == 3) {
                l1.setText("Maart Dagen: 31");
            }

            if (d1 == 4) {
                l1.setText("April Dagen: 30");
            }

            if (d1 == 5) {
                l1.setText("Mei Dagen: 31");
            }

            if (d1 == 6) {
                l1.setText("Juni Dagen 30");
            }

            if (d1 == 7) {
                l1.setText("Juli Dagen: 31");
            }

                if (d1 == 8) {
                    l1.setText("Augustus Dagen: 31");
                }

                if (d1 == 9) {
                    l1.setText("September Dagen: 30");
                }

                if (d1 == 10) {
                    l1.setText("October Dagen: 31");
                }

                if (d1 == 11) {
                    l1.setText("November Dagen: 30");
                }

                if (d1 == 12) {
                    l1.setText("December Dagen: 31");
                }

                if (d1 > 12) {
                    l1.setText("Maand:  ");
                }

                if (d1 < 0) {
                    l1.setText("Maand:  ");
            }
                repaint();
        }
    }
}






