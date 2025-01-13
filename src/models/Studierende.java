
package models;

/**
 * Repräsentiert einen Studierenden als Benutzer der Bibliothek.
 */
public class Studierende extends Benutzer {
    /**
     * Konstruktor für die Klasse Studierende.
     * @param name Der Name des Studierenden.
     */
    public Studierende(String name) {
        super(name, 3);
    }

    @Override
    public String getBenutzerTyp() {
        return "Studierende";
    }
}
