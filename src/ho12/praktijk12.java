package ho12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijk12 extends Applet {

    Button knop;

    int teller = 0;
    int y;

    //namen
    String s1[] = new String[10];
    //telefoonnummers
    String s2[] = new String[10];
    TextField vak1;
    TextField vak2;

    Label stick1;
    Label stick2;

    public void init () {

        setSize(1000,700);
        setBackground(Color.orange);

        knop = new Button("oke");
        knop.addActionListener(new oke());
        add(knop);

        vak1 = new TextField("");
        vak1.addActionListener(new oke());
        add(vak1);

        vak2 = new TextField("");
        vak2.addActionListener(new oke());
        add(vak2);

        stick1 = new Label("vul hier uw naam in");
        add(stick1);

        stick2 =  new Label("vul hier het telefoonnummer in");
        add(stick2);

    }

    public void paint (Graphics g) {

        knop.setLocation(500,100);
        knop.setSize(100,40);

        vak1.setLocation(100,100);
        vak1.setSize(150,40);

        vak2.setLocation(300,100);
        vak2.setSize(150,40);

        stick1.setLocation(110,80);
        stick1.setSize(160,30);

        stick2.setLocation(290,80);
        stick2.setSize(170,30);

        y = 250;

        if (teller > 9) {

            for (int count = 0; count < s1.length; count++) {
                y += 20;
                g.drawString("Naam:   " + s1[count] + "       Telefoonnummer:   " + s2[count], 200,y);
            }
        }
    }

    class oke implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String message;
            message = vak1.getText();

            String bericht;
            bericht = vak2.getText();

            if (teller <= 9) {

                s1[teller] = message;
                s2[teller] = bericht;
            }
            teller++;

            vak1.setText("");
            vak2.setText("");

            repaint();
        }
    }
}