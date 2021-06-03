package ho12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class opdracht12_4 extends Applet {

    boolean gevonden;

    double getal[] = { 23,55,74,24,86,24,100 };
    double gezocht;

    TextField vak;
    Button knop;
    String s1;
    String s2;

    public void init () {

        setSize(1000,400);

        s1 = "";
        s2 = "";

        knop = new Button("oke");
        knop.addActionListener(new oke());
        add(knop);

        vak = new TextField("");
        vak.addActionListener(new oke ());
        add(vak);

    }

    public void paint (Graphics g) {

        //knop
        knop.setLocation(100,50);
        knop.setSize(100,40);

        //textvak
        vak.setLocation(100,100);
        vak.setSize(100,40);

        //String
        g.drawString(s1, 240,125);
        g.drawString(s2, 240,140);

        //getallen tabel
        for (int teller = 0; teller < getal.length; teller ++) {

            g.drawString("" + getal[teller], 130, 30 * teller + 175);
        }
    }

    class oke implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println(s2);

            String message;
            message = vak.getText();
            gezocht = Double.parseDouble(message);

            gevonden = false;


            int teler = 0;
            while (teler < getal.length) {

                if (getal[teler] == gezocht) {
                    gevonden = true;

                }
                teler++;
            }

            for (int teller = 0; teller < getal.length; teller++) {

                if (gevonden == true) {
                    s1 = "de waarde  " + gezocht +" is gevonden";
                    s2 = "index    " + teler;

                }

                else{
                    s1 = "de waarde  " + gezocht + " is niet gevonden";
                    s2 = "index is niet mogelijk   " ;
                    
                }
            }
            repaint();
        }
    }
}
