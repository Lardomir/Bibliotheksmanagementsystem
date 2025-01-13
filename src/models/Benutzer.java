
package models;

/**
 * Abstrakte Klasse, die die Eigenschaften eines Benutzers beschreibt.
 * Implementiert das Interface Suchbar.
 */
public abstract class Benutzer implements Suchbar {
    private String name;
    private int maxAusleihen;
    private int aktuelleAusleihen;

    /**
     * Konstruktor für die Klasse Benutzer.
     * @param name Der Name des Benutzers.
     * @param maxAusleihen Die maximale Anzahl an Büchern, die der Benutzer ausleihen kann.
     */
    public Benutzer(String name, int maxAusleihen) {
        this.name = name;
        this.maxAusleihen = maxAusleihen;
        this.aktuelleAusleihen = 0;
    }

    public String getName() {
        return name;
    }

    public int getMaxAusleihen() {
        return maxAusleihen;
    }

    public int getAktuelleAusleihen() {
        return aktuelleAusleihen;
    }

    public void ausleiheErhoehen() {
        this.aktuelleAusleihen++;
    }

    public void ausleiheVerringern() {
        this.aktuelleAusleihen--;
    }

    /**
     * Überprüft, ob der Benutzer weitere Bücher ausleihen kann.
     * @return true, wenn weitere Ausleihen möglich sind, sonst false.
     */
    public boolean kannAusleihen() {
        return aktuelleAusleihen < maxAusleihen;
    }

    /**
     * Gibt den Typ des Benutzers zurück.
     * Diese Methode muss von den Subklassen implementiert werden.
     * @return Der Benutzertyp als String.
     */
    public abstract String getBenutzerTyp();

    @Override
    public String getSuchbegriff() {
        return name;
    }
}
