package ho12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class opdracht12_3 extends Applet {

    Button knop;
    TextField vak[] = new TextField[5];
    double getal[] = new double[5];

    public void init () {

        setSize(1000,400);

        knop = new Button("oke");
        knop.addActionListener(new oke());
        add(knop);

        for (int i = 0; i < vak.length ; i++) {
            vak[i] = new TextField("",5);
            add(vak[i]);
        }
    }

    public void paint (Graphics g) {

        knop.setLocation(155,100);
        knop.setSize(50,50);

    }

    class oke implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("klik");

            for ( int teller = 0; teller < vak.length; teller++) {

                String message;
                message = vak[teller].getText();
                getal[teller] = Double.parseDouble(message);
           }
           Arrays.sort(getal);

            for (int i = 0; i < vak.length; i++) {

                vak[i].setText(getal[i]+ "");

            }
        }
    }
}

