
import models.*;
import services.AusleihService;

/**
 * Hauptklasse des Bibliotheksmanagementsystems.
 * Startet die Anwendung und demonstriert die Funktionen der Bibliothek.
 */
public class App {
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek();
        AusleihService ausleihService = new AusleihService();

        // Bücher erstellen und hinzufügen
        Buch buch1 = new Sachbuch("Java Programmierung", "Max Mustermann");
        Buch buch2 = new Roman("Die Abenteuer", "Erika Beispiel");
        bibliothek.buchHinzufuegen(buch1);
        bibliothek.buchHinzufuegen(buch2);

        // Benutzer erstellen und hinzufügen
        Benutzer benutzer1 = new Studierende("Anna Student");
        Benutzer benutzer2 = new Dozenten("Dr. Schmidt");
        bibliothek.benutzerHinzufuegen(benutzer1);
        bibliothek.benutzerHinzufuegen(benutzer2);

        // Buch ausleihen und Verfügbarkeit prüfen
        ausleihService.buchAusleihen(buch1, benutzer1);

        // Verfügbare Bücher anzeigen
        for (Buch buch : bibliothek.getVerfuegbareBuecher()) {
            System.out.println("Verfügbares Buch: " + buch.getTitel());
        }

        // Buch zurückgeben
        ausleihService.buchZurueckgeben(buch1, benutzer1);

        // Bücher und Benutzer durchsuchen
        System.out.println("Suche nach \"Java\":");
        for (Suchbar suchbar : bibliothek.suche("Java")) {
            System.out.println("Gefunden: " + suchbar.getSuchbegriff());
        }
    }
}
