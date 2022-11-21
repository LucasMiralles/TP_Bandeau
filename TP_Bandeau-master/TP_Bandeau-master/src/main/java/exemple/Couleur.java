package exemple;

import bandeau.Bandeau;

import java.awt.*;


public class Couleur implements Effet{


    public Couleur() {
    }
    public void effect(Bandeau bandeau) {
        Font font = bandeau.getFont();
        Color back = bandeau.getBackground();
        Color fore = bandeau.getForeground();

        bandeau.setMessage("On va changer de couleur");
        bandeau.sleep(1000);
        bandeau.setBackground(Color.RED);
        bandeau.setMessage("On va changer de couleur");
        bandeau.sleep(1000);
        bandeau.setForeground(Color.BLUE);
        bandeau.sleep(1000);
        bandeau.setFont(font);
        bandeau.setForeground(fore);
        bandeau.setBackground(back);
    }
}
