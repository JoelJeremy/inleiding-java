package ho10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht101 extends Applet {

    TextField vak;
    TextField v2;
    Label l1;
    Label l2;
    String vak1;

    double d1;
    double d2;

    public void init() {
        setBackground(Color.ORANGE);

        vak = new TextField("");
        vak.addActionListener(new vakken());
        vak1 = "";
        add(vak);

        v2 = new TextField("0");
        v2.addActionListener(new vakken());
        add(v2);

        l1 = new Label("Vul hier het getal in: ");
        add(l1);

        l2 = new Label("Hoogste getal: ");
        add(l2);


    }

    public void paint(Graphics g) {

        setSize(800, 500);

        vak.setLocation(200, 50);
        vak.setSize(140, 30);

        v2.setLocation(200, 100);
        v2.setSize(140, 30);

        l1.setLocation(80, 40);
        l1.setSize(200, 50);

        l2.setLocation(80, 90);
        l2.setSize(200, 50);

    }

    class vakken implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("klik");

            String message;;
            message = vak.getText();
            d1 = Double.parseDouble(message);

            String bericht;
            bericht = v2.getText();
            d2 = Double.parseDouble(bericht);

            if ( d1 > d2) {
                v2.setText("" + d1);

                repaint();

            }
        }
    }
}


