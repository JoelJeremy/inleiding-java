package ho10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class praktijk10 extends Applet {

    TextField vak1 ;
    Label l1;
    String s1, s2;
    int cijfer;

    public void init() {
        setSize(800,400);
        setBackground(Color.magenta);

        vak1 = new TextField("");
        vak1.addActionListener( new goed());
        add(vak1);

        s2 = "";

        l1 = new Label("Typ hier uw cijfer in: ");
        add(l1);

    }

    public void paint(Graphics g) {

        vak1.setLocation(170,100);
        vak1.setSize(100,30);

        l1.setLocation(30,100);
        l1.setSize(150,40);

        g.drawString(s2, 100, 170);

    }

    class goed implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            s1 = vak1.getText();
            cijfer = Integer.parseInt( s1);
            switch(cijfer) {

                case 1:
                    s2 = "U heeft een slecht cijfer";
                    break;
                case 2:
                    s2 = "U heeft een slecht cijfer";
                    break;
                case 3:
                    s2 = "u heeft een slecht cijfer";
                    break;
                case 4:
                    s2 = "u heeft een onvoldoende";
                    break;
                case 5:
                    s2 = "U heeft een matig";
                    break;
                case 6:
                    s2 = "u heeft een voldoende";
                    break;
                case 7:
                    s2 = "u heeft een voldoende";
                    break;
                case 8:
                    s2 = "u heeft een goed";
                    break;
                case 9:
                    s2 = "u heeft een goed";
                    break;
                case 10:
                    s2 = "u heeft een goed";
                    break;
                default:
                    s2 = "U hebt een verkeerd nummer ingetoetst !";
                    break;
            }
            repaint();
        }
    }
}
