package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom implements Effet{


    public Zoom() {
    }
    public void effect(Bandeau bandeau) {
        bandeau.setMessage("On va zoomer");
        bandeau.sleep(1000);
        bandeau.setMessage("Je me rapproche !");
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
        bandeau.sleep(1000);
    }
}
