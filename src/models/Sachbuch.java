
package models;

/**
 * Repräsentiert ein Sachbuch in der Bibliothek.
 */
public class Sachbuch extends Buch {
    /**
     * Konstruktor für die Klasse Sachbuch.
     * @param titel Der Titel des Buches.
     * @param autor Der Autor des Buches.
     */
    public Sachbuch(String titel, String autor) {
        super(titel, autor);
    }

    @Override
    public String getKategorie() {
        return "Sachbuch";
    }
}
