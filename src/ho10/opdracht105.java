package ho10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht105 extends Applet {

    Button b1;
    Button middeld;
    Button reset;

    Label l1;
    TextField v1,v2;
    String s1,s2;

    float d1,d2,oke,step,uitkomst;
    int tussen;

    public void init () {
        setSize(800,400);
        setBackground(Color.orange);

        b1 = new Button("oke");
        b1.addActionListener(new oke());
        add(b1);

        middeld = new Button("Gemiddelde");
        middeld.addActionListener(new middelde());
        add(middeld);

        reset = new Button("Reset");
        reset.addActionListener(new reset());
        add(reset);

        v1 = new TextField("");
        v1.addActionListener(new oke());
        add(v1);

        v2 = new TextField("");
        add(v2);

        l1 = new Label("");
        add(l1);

    }

    public void paint (Graphics g) {

        b1.setLocation(250,100);
        b1.setSize(140,40);

        middeld.setLocation(400,100);
        middeld.setSize(140,40);

        reset.setLocation(550,100);
        reset.setSize(140,40);

        v1.setLocation(250,150);
        v1.setSize(140,40);

        v2.setLocation(400,150);
        v2.setSize(140,40);

        l1.setLocation(100,250);
        l1.setSize(150,40);

        g.drawString(s1, 250, 220);
        g.drawString(s2, 250, 250);

    }

    class oke implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("klik");

            String message;
            message = v1.getText();
            d1 = Float.parseFloat(message);

            v2.setText(""+ oke);

            String bericht = v1.getText();
            v2.setText(bericht);


            if (d1 > 5.5) {
                s1 = "u heeft een voldoende ";
            }

            else {
                s1 = "u heeft een onvoldoende";
            }

            if (d1 > 10) {
                s1 = "Het getal mag niet hoger als 10 zijn";
            }

            if ( d1 < 0 ) {
                s1 = "Het getal mag niet lager als 0 zijn";
            }

            v1.setText("");

            repaint();
        }
    }
    class middelde implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String message;
            message = v1.getText();
            d1 = Float.parseFloat(message);

            String m1;
            m1 = v2.getText();
            d2 = Float.parseFloat(m1);

            oke = (d1+d2)/2;
            step = oke *10;

            tussen = (int) step;
            uitkomst = (float) tussen/10;

            v2.setText(""+ uitkomst);

            if ( d2 > 5.5) {
                s2 = "u bent geslaagd!";
            }

            else{
                s2 = "u bent niet geslaagd";
            }

            repaint();
        }
    }

    class reset implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            v1.setText("");
            v2.setText("");
            s1 = "";
            s2 = "";

            repaint();
        }
    }
}
