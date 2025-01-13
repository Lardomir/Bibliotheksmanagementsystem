
package services;

import models.Buch;
import models.Benutzer;

/**
 * Service-Klasse für die Verwaltung von Buchausleihen.
 */
public class AusleihService {
    /**
     * Verleiht ein Buch an einen Benutzer, falls verfügbar.
     * @param buch Das Buch, das ausgeliehen werden soll.
     * @param benutzer Der Benutzer, der das Buch ausleihen möchte.
     * @return true, wenn das Buch erfolgreich ausgeliehen wurde, sonst false.
     */
    public boolean buchAusleihen(Buch buch, Benutzer benutzer) {
        if (!buch.isVerfuegbar()) {
            System.out.println("Das Buch \"" + buch.getTitel() + "\" ist nicht verfügbar.");
            return false;
        }

        if (!benutzer.kannAusleihen()) {
            System.out.println(benutzer.getName() + " hat das maximale Ausleihlimit erreicht.");
            return false;
        }

        buch.setVerfuegbar(false);
        benutzer.ausleiheErhoehen();
        System.out.println(benutzer.getName() + " hat das Buch \"" + buch.getTitel() + "\" ausgeliehen.");
        return true;
    }

    /**
     * Gibt ein ausgeliehenes Buch zurück.
     * @param buch Das zurückzugebende Buch.
     * @param benutzer Der Benutzer, der das Buch zurückgibt.
     */
    public void buchZurueckgeben(Buch buch, Benutzer benutzer) {
        buch.setVerfuegbar(true);
        benutzer.ausleiheVerringern();
        System.out.println("Das Buch \"" + buch.getTitel() + "\" wurde zurückgegeben.");
    }
}
