
package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse für die Verwaltung von Büchern und Benutzern in einer Bibliothek.
 */
public class Bibliothek {
    private List<Buch> buecher = new ArrayList<>();
    private List<Benutzer> benutzer = new ArrayList<>();

    /**
     * Fügt ein Buch zur Bibliothek hinzu.
     * @param buch Das hinzuzufügende Buch.
     */
    public void buchHinzufuegen(Buch buch) {
        buecher.add(buch);
    }

    /**
     * Fügt einen Benutzer zur Bibliothek hinzu.
     * @param benutzer Der hinzuzufügende Benutzer.
     */
    public void benutzerHinzufuegen(Benutzer benutzer) {
        this.benutzer.add(benutzer);
    }

    /**
     * Gibt eine Liste aller verfügbaren Bücher zurück.
     * @return Liste der verfügbaren Bücher.
     */
    public List<Buch> getVerfuegbareBuecher() {
        List<Buch> verfuegbareBuecher = new ArrayList<>();
        for (Buch buch : buecher) {
            if (buch.isVerfuegbar()) {
                verfuegbareBuecher.add(buch);
            }
        }
        return verfuegbareBuecher;
    }

    /**
     * Sucht nach Büchern oder Benutzern, die das angegebene Schlüsselwort enthalten.
     * @param keyword Das Such-Schlüsselwort.
     * @return Liste der Suchergebnisse.
     */
    public List<Suchbar> suche(String keyword) {
        List<Suchbar> ergebnisse = new ArrayList<>();
        for (Buch buch : buecher) {
            if (buch.getSuchbegriff().contains(keyword)) {
                ergebnisse.add(buch);
            }
        }
        for (Benutzer ben : benutzer) {
            if (ben.getSuchbegriff().contains(keyword)) {
                ergebnisse.add(ben);
            }
        }
        return ergebnisse;
    }
}
