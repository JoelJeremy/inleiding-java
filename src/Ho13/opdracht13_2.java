package Ho13;

import java.applet.Applet;
import java.awt.*;

public class opdracht13_2 extends Applet {

    public void init() {

        setSize(1200, 700);

    }

    public void paint(Graphics g) {

        tekenBaksteen(g, 100, 100, 50, 20, Color.red, 10, 8);
    }

    void tekenBaksteen(Graphics g, int beginpuntx, int beginpunty, int breedtesteen, int hoogtesteen, Color kleursteen, int aantalnaast, int aantalop) {

        for (int naast = 0; naast < aantalnaast; naast++) {

            for (int op = 0; op < aantalop; op++) {

                g.setColor(kleursteen);
                g.fillRect(beginpuntx + naast * breedtesteen, beginpunty + op * hoogtesteen, breedtesteen, hoogtesteen);

                g.setColor(Color.darkGray);
                g.drawRect(beginpuntx + naast * breedtesteen, beginpunty + op * hoogtesteen, breedtesteen, hoogtesteen);

            }
        }
    }
}



