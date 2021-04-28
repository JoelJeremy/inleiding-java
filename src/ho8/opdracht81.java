package ho8;
//Joel Amah
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht81 extends Applet {

         TextField tekstvak;

         Label sticker;

         Button knopie;
         Button reset;

    public void init() {
        setSize(1000,600);

        //knopje
        knopie = new Button("oke");
        knopie.addActionListener(new Joeltoterminal());
        add(knopie);

        //reset
        reset = new Button( "reset");
        reset.addActionListener(new Clear());
        add(reset);

        //tekstvak
        tekstvak = (new TextField("type hier"));
        add(tekstvak);

        //label
        sticker = new Label("antwoord");
        add(sticker);

    }

    public void paint(Graphics g) {

        //oke
        knopie.setLocation(400,50);
        knopie.setSize(150,40);

        //reset
        reset.setLocation(550,50);
        reset.setSize(150,40);

       //tekstvak
        tekstvak.setSize(200,30);
        tekstvak.setLocation(150,50);
        tekstvak.getText();

        //label
        sticker.getText();
        sticker.setSize(200,40);
        sticker.setLocation(200,100);

    }
    class Joeltoterminal implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("knopklik");

            String message = tekstvak.getText();
            sticker.setText(message);

            repaint();

        }
    }
    class Clear implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}
