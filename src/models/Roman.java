
package models;

/**
 * Repräsentiert einen Roman in der Bibliothek.
 */
public class Roman extends Buch {
    /**
     * Konstruktor für die Klasse Roman.
     * @param titel Der Titel des Buches.
     * @param autor Der Autor des Buches.
     */
    public Roman(String titel, String autor) {
        super(titel, autor);
    }

    @Override
    public String getKategorie() {
        return "Roman";
    }
}
