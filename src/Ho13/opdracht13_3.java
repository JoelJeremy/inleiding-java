package Ho13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht13_3 extends Applet {

    int a = 0;

    Button rood;
    Button gray;

    public void init() {

        setSize(1200,700);

        rood = new Button("rood");
        rood.addActionListener(new rood());
        add(rood);

        gray = new Button("gray");
        gray.addActionListener(new gray());
        add(gray);
    }

    public void paint(Graphics g) {

        if (a == 1) {
            tekenBaksteen(g, 100,100,50,20, Color.red, 10,8);
        }

        if (a == 2) {
            tekenBaksteen(g, 100, 300, 80, 80, Color.darkGray, 8, 4);
        }
    }

    void tekenBaksteen (Graphics g,int beginpuntx, int beginpunty, int breedtesteen, int hoogtesteen, Color kleursteen, int aantalnaast, int aantalop) {

        for ( int naast = 0; naast < aantalnaast; naast++) {

            for ( int op = 0; op < aantalop; op++) {

                g.setColor(kleursteen);
                g.fillRect(beginpuntx + naast * breedtesteen, beginpunty + op * hoogtesteen, breedtesteen, hoogtesteen);

                g.setColor(Color.white);
                g.drawRect(beginpuntx + naast * breedtesteen, beginpunty + op * hoogtesteen, breedtesteen, hoogtesteen);

            }
        }
    }

    class rood implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            a = 1;

            repaint();
        }
    }

    class gray implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            a = 2;

            repaint();
        }
    }
}



