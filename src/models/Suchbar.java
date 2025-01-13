
package models;

/**
 * Interface zur Unterstützung von Suchfunktionen.
 * Implementierende Klassen müssen die Methode getSuchbegriff() bereitstellen.
 */
public interface Suchbar {
    /**
     * Gibt den Begriff zurück, der für die Suche verwendet werden soll.
     * @return Der Suchbegriff als String.
     */
    String getSuchbegriff();
}
