
package models;

/**
 * Repräsentiert einen Dozenten als Benutzer der Bibliothek.
 */
public class Dozenten extends Benutzer {
    /**
     * Konstruktor für die Klasse Dozenten.
     * @param name Der Name des Dozenten.
     */
    public Dozenten(String name) {
        super(name, 5);
    }

    @Override
    public String getBenutzerTyp() {
        return "Dozent";
    }
}
