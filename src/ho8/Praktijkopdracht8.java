package ho8;
//Joel Amah
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht8 extends Applet {
    Button plus;
    Button min;
    Button keer;
    Button delend;
    Button reset;

    TextField vak1;
    TextField vak2;

    double v1;
    double v2;
    double totaal;

    public void init() {

        plus = new Button("+");
        plus.addActionListener(new plus());
        add(plus);

        min = new Button("-");
        min.addActionListener(new min());
        add(min);

        keer = new Button("*");
        keer.addActionListener(new keer());
        add(keer);

        delend = new Button("/");
        delend.addActionListener(new delend());
        add(delend);

        reset = new Button("reset");
        reset.addActionListener(new reset());
        add(reset);

        vak1 = new TextField("");
        add(vak1);

        vak2 = new TextField("");
        add(vak2);

    }

    public void paint(Graphics g) {

        setSize(1200,800);

        plus.setLocation(420,50);
        plus.setSize(20,20);

        min.setLocation(445,50);
        min.setSize(20,20);

        keer.setLocation(470,50);
        keer.setSize(20,20);

        delend.setLocation(495,50);
        delend.setSize(20,20);

        reset.setLocation(520,50);
        reset.setSize(50,20);

        vak1.setLocation(200,50);
        vak1.setSize(100,20);

        vak2.setLocation(310,50);
        vak2.setSize(100,20);

    }

    class plus implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("klik");

            String message = vak1.getText();
            String bericht = vak2.getText();

            v1 = Double.parseDouble(message);
            v2 = Double.parseDouble(bericht);

            totaal = v1+v2;

            vak1.setText(""+ totaal);
            vak2.setText("");

            repaint();

        }
    }

    class min implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("klik");

            String message = vak1.getText();
            String bericht = vak2.getText();

            v1 = Double.parseDouble(message);
            v2 = Double.parseDouble(bericht);

            totaal = v1-v2;

            vak1.setText(""+ totaal);
            vak2.setText("");

            repaint();

        }
    }

    class keer implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("klik");

            String message = vak1.getText();
            String bericht = vak2.getText();

            v1 = Double.parseDouble(message);
            v2 = Double.parseDouble(bericht);

            totaal = v1*v2;

            vak1.setText(""+ totaal);
            vak2.setText("");

            repaint();

        }
    }

    class delend implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("klik");

            String message = vak1.getText();
            String bericht = vak2.getText();

            v1 = Double.parseDouble(message);
            v2 = Double.parseDouble(bericht);

            totaal = v1/v2;

            vak1.setText(""+ totaal);
            vak2.setText("");

            repaint();

        }
    }

    class reset implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("klik");
            vak1.setText("");
            vak2.setText("");

            repaint();

        }
    }
}
