package ho10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht102 extends Applet {

    TextField vak;
    TextField v2;
    TextField v3;
    Label l1;
    Label l2;
    Label l3;
    String vak1;

    double d1;
    double d2;
    double d3;

    public void init() {
        setBackground(Color.orange);

        vak = new TextField("");
        vak.addActionListener(new vakken());
        vak1 = "";
        add(vak);

        v2 = new TextField("0");
        add(v2);

        v3 = new TextField("999999");
        add(v3);

        l1 = new Label("Vul hier het getal in: ");
        add(l1);

        l2 = new Label("Hoogste getal: ");
        add(l2);

        l3 = new Label("Laagste getal: ");
        add(l3);

    }

    public void paint(Graphics g) {

        setSize(1200, 800);

        vak.setLocation(200, 50);
        vak.setSize(140, 30);

        v2.setLocation(200, 100);
        v2.setSize(140, 30);

        v3.setLocation(200, 150);
        v3.setSize(140, 30);

        l1.setLocation(80, 40);
        l1.setSize(200, 50);

        l2.setLocation(80, 90);
        l2.setSize(200, 50);

        l3.setLocation(80, 140);
        l3.setSize(200, 50);

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

            String massa;
            massa = v3.getText();
            d3 = Double.parseDouble(massa);

            if ( d1 > d2) {
                v2.setText("" + d1);
            }

            if (d1 > d3) {
                v3.setText(""+d3);
            }

            else {
                v3.setText(""+d1);
            }
            repaint();
        }
    }
}


