package ho11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijk112 extends Applet {

    Button b1;
    TextField vak1;

    int a=1;
    int b=1;
    int y;

    public void init() {

        setSize(1000, 500);
        setBackground(Color.orange);

        b1 = new Button("oke");
        b1.addActionListener(new oke());
        add(b1);

        vak1 = new TextField(""+a);
        vak1.addActionListener(new oke());
        add(vak1);

    }

    public void paint(Graphics g) {

        b1.setLocation(300, 100);
        b1.setSize(100, 40);

        vak1.setLocation(100, 100);
        vak1.setSize(150, 40);


        y = 150;

        for (int teller = 1; teller <= 10; teller++) {

            y += 20;
            g.drawString(a + "  x  " + teller +" = " + (a * teller), 100, y);
        }
    }

    class oke implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("klik");

            String message;
            message = vak1.getText();
            a = Integer.parseInt(message);

            a= a+b++;

            repaint();

        }
    }
}

