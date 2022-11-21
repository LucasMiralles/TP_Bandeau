package exemple;
import bandeau.Bandeau;


public class main {
    public static void main(String[] args) {
        Bandeau b = new Bandeau();
        Scenario s = new Scenario(b);
        Rotation r = new Rotation("Je tooooouuuurne !");
        Couleur c = new Couleur();
        Zoom z = new Zoom();
        s.ajouterEffet(z, 2);
        s.ajouterEffet(r, 2);
        s.ajouterEffet(c, 3);
        s.demarrerScenario();


    }
}

