
package models;

/**
 * Abstrakte Klasse, die die grundlegenden Eigenschaften eines Buches beschreibt.
 * Implementiert das Interface Suchbar.
 */
public abstract class Buch implements Suchbar {
    private String titel;
    private String autor;
    private boolean verfuegbar;

    /**
     * Konstruktor für die Klasse Buch.
     * @param titel Der Titel des Buches.
     * @param autor Der Autor des Buches.
     */
    public Buch(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
        this.verfuegbar = true;
    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isVerfuegbar() {
        return verfuegbar;
    }

    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }

    /**
     * Gibt die Kategorie des Buches zurück.
     * Diese Methode muss von den Subklassen implementiert werden.
     * @return Die Kategorie des Buches.
     */
    public abstract String getKategorie();

    @Override
    public String getSuchbegriff() {
        return titel;
    }
}
