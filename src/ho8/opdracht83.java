package ho8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht83 extends Applet {
//Joel Amah
    Button oke;
    Button reset;
    TextField vak;
    Label sticker;

    double result;
    double totaal;
    double c1;
    double btw;


    public void init() {
        setSize(1200,800);

        //oke knop
        oke = new Button("bereken");
        oke.addActionListener(new oke());
        add(oke);

        reset = new Button("reset");
        reset.addActionListener(new reset());
        add(reset);


        //tekstvak
        vak = new TextField("");
        vak.addActionListener(new oke());
        add(vak);

        //Label
        sticker = new Label("incl BTW:   ");
        add(sticker);

        //BTW
        btw = 0.21;

    }

    public void paint(Graphics g) {

        //oke knop
        oke.setLocation(300,50);
        oke.setSize(150,40);

        //reset
        reset.setLocation(450,50);
        reset.setSize(150,40);

        //tekstvak
        vak.setLocation(160,50);
        vak.setSize(150,40);

        //Label
        sticker.setLocation(220,126);
        sticker.setSize(70,40);

        g.drawString("" + totaal, 300, 150 );
    }
    class oke implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("klik");
            String message = vak.getText();
            c1 = Double.parseDouble(message);

            result = c1*btw;
            totaal = result+c1;




            repaint();
        }
    }
    class reset implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            vak.setText("");

        }
    }
}

