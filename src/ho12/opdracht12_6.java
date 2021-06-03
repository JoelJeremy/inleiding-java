package ho12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht12_6 extends Applet {

    boolean gevonden;
    double getal[] = { 5,5,5,10,13,6,7,8,7,8,8,5,10};
    double gezocht;

    Button knop;
    TextField vak;
    String s1;
    String s2;
    Label sticker;

    public void init () {

        setSize(1000,750);

        knop = new Button("oke");
        knop.addActionListener(new oke ());
        add(knop);

        vak = new TextField("");
        vak.addActionListener(new oke());
        add(vak);

        sticker = new Label("Vul hier het getal dat u zoekt");
        add(sticker);

        s1 = "";
        s2 = "";

    }

    public void paint (Graphics g) {

        knop.setLocation(400,100);
        knop.setSize(100,40);

        vak.setLocation(250,100);
        vak.setSize(100,40);

        sticker.setLocation(225,80);
        sticker.setSize(170,25);

        int y = 100;

        for (int teller= 0; teller <= 11; teller++) {

            y += 50;
            g.drawLine(100, y, 200, y);

            g.drawRect(100, 100, 100, 650);

        }

        //getallen tabel
        for (int teller = 0; teller < getal.length; teller ++) {

            g.drawString("" + getal[teller], 140, 50 * teller + 130);
        }

        g.drawString(s1, 240,200);
        g.drawString(s2, 240,220);

    }

    class oke implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("index");

            String message;
            message = vak.getText();
            gezocht = Double.parseDouble(message);

            double frequentie = 0;
            gevonden = false;

            int teler = 0;
            while (teler < getal.length) {


                if (getal[teler] == gezocht) {
                    gevonden = true;

                    break;
                }
                teler++;
            }

            for (int teller = 0; teller < getal.length; teller++) {

                if (getal[teller] == gezocht) {
                    frequentie++;

                    if (gevonden == true) {

                        s1 = "de waarde  " + gezocht + " is gevonden";
                        s2 = "het getal " + gezocht + "  komt " + frequentie + " keer voor ";
                    }
                }
                System.out.println( teller + "  de "+ gezocht + "  komt " + frequentie + "  keer voor");
            }
            repaint();
        }
    }
}
