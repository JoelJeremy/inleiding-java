package ho10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht104 extends Applet {

    TextField tv1;
    TextField tv2;

    Label l2;
    Label l1;
    Label l15;
    String s1;

    int maand;
    int jaartal;

    public void init() {

        setSize(800, 400);

        setBackground(Color.orange);

        tv1 = new TextField("");
        tv1.addActionListener(new maanden());
        add(tv1);

        tv2 = new TextField("");
        tv2.addActionListener(new maanden());
        add(tv2);

        l1 = new Label("Maand:");
        add(l1);

        l15 = new Label("Datum:  ");
        add(l15);

        l2 = new Label("Jaartal");
        add(l2);

    }

    public void paint(Graphics g) {


        tv1.setLocation(100, 100);
        tv1.setSize(150, 40);

        tv2.setLocation(350, 100);
        tv2.setSize(150, 40);

        l1.setLocation(50, 100);
        l1.setSize(140, 40);

        l15.setLocation(100, 140);
        l15.setSize(200, 40);

        l2.setLocation(300, 100);
        l2.setSize(140, 40);

        g.drawString(s1, 350, 160);

    }

    class maanden implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("klik");

            String message;
            message = tv1.getText();
            maand = Integer.parseInt(message);

            String bericht;
            bericht = tv2.getText();
            jaartal = Integer.parseInt(bericht);

            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                s1 = "" + jaartal + " is een schrikkeljaar";

                l15.setText("februari Dagen: 29   ");
            }

            else {
                s1 = "" + jaartal + " is geen schrikkeljaar";
                l15.setText("februari Dagen: 28   ");
            }

            if (maand == 1) {
                l15.setText("Januari Dagen: 31  ");
            }

            if (maand == 3) {
                l15.setText("Maart Dagen: 31    ");
            }

            if (maand == 4) {
                l15.setText("April Dagen: 30   " );
            }

            if (maand == 5) {
                l15.setText("Mei Dagen: 31  ");
            }

            if (maand == 6) {
                l15.setText("Juni Dagen 30   " );
            }

            if (maand == 7) {
                l15.setText("Juli Dagen: 31   ");
            }

            if (maand == 8) {
                l15.setText("Augustus Dagen: 31   ");
            }

            if (maand == 9) {
                l15.setText("September Dagen: 30   ");
            }

            if (maand == 10) {
                l15.setText("October Dagen: 31   ");
            }

            if (maand == 11) {
                l15.setText("November Dagen: 30   ");
            }

            if (maand == 12) {
                l15.setText("December Dagen: 31   ");
            }

            if (maand > 12) {
                l15.setText("Datum:  ");
            }

            if (maand < 0) {
                l15.setText("Datum:  ");
            }
            repaint();
        }
    }
}



