package ho8;
//Joel Amah
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht82 extends Applet {
    Button vrouw;
    Button man;
    Button meisje;
    Button jongen;

    TextField vak1;
    TextField vak2;
    TextField vak3;
    TextField vak4;
    TextField vak5;

    int c1;
    int c2;
    int c3;
    int c4;
    int total;

    public void init() {
        setSize(1500,800);
        setBackground(Color.orange);

        //vrouwen
        vrouw = new Button("Vrouwen");
        vrouw.addActionListener(new vrouw());
        add(vrouw);
        vak1 = (new TextField("Vrouwen; "));
        add(vak1);

        //mannen
        man = new Button("Mannen");
        man.addActionListener(new man());
        add(man);
        vak2 = (new TextField("Mannen: "));
        add(vak2);

        //meisjes
        meisje = new Button("Meisjes potentieel");
        meisje.addActionListener(new meisje());
        add(meisje);
        vak3 = (new TextField("Meisjes; "));
        add(vak3);

        //jongens
        jongen = new Button("Jongens potentieel");
        jongen.addActionListener(new jongen());
        add(jongen);
        vak4 = (new TextField("Jongens: "));
        add(vak4);

        //totaal
        vak5 = (new TextField("Totaal:  "));
        add(vak5);

        total = c1+c2+c3+c4;

    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(90,30, 1000,150);
        g.setColor(Color.black);
        g.drawRect(90,30,1000,150);

        //vrouwen
        vrouw.setLocation(100,50);
        vrouw.setSize(150,40);
        vak1.setLocation(100,100);
        vak1.setSize(150,40);

        //mannen
        man.setLocation(255,50);
        man.setSize(150,40);
        vak2.setLocation(255,100);
        vak2.setSize(150,40);

        //meisjes
        meisje.setLocation(410,50);
        meisje.setSize(150,40);
        vak3.setLocation(410,100);
        vak3.setSize(150,40);

        //jongens
        jongen.setLocation(565,50);
        jongen.setSize(150,40);
        vak4.setLocation(565,100);
        vak4.setSize(150,40);

        //totaal
        vak5.setLocation(720,100);
        vak5.setSize(150,40);
        vak5.setText("totaal: "+total);
    }

    class vrouw implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("klik" + c1);
            c1++;
            total++;
            vak1.setText("Vrouwen: " + c1);
            repaint();
        }
    }

    class man implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("klik" + c2);
            c2++;
            total++;
            vak2.setText("Mannen: " + c2);
            repaint();
        }
    }

    class meisje implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("klik" + c3);
            c3++;
            total++;
            vak3.setText("Meisjes: " + c3);
            repaint();
        }
    }

    class jongen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("klik" + c4);
            c4++;
            total++;
            vak4.setText("Jongens: " + c4);
            repaint();
        }
    }
}