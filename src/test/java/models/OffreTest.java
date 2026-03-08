package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.sql.Time;
import java.util.Date;

class OffreTest {

    @Test
    void testOffreCreation() {
        Offre offre = new Offre();
        offre.setVilleDepart("Casablanca");
        offre.setVilleArrivee("Rabat");
        offre.setPrixParPlace(50.0); // ✅ utilise la vraie méthode
        assertEquals("Casablanca", offre.getVilleDepart());
        assertEquals("Rabat", offre.getVilleArrivee());
        assertEquals(50.0, offre.getPrixParPlace()); // ✅ corrigé
    }

    @Test
    void testPrixPositif() {
        Offre offre = new Offre();
        offre.setPrixParPlace(30.0); // ✅ utilise la vraie méthode
        assertTrue(offre.getPrixParPlace() > 0); // ✅ corrigé
    }

    @Test
    void testStatutParDefaut() {
        Offre offre = new Offre();
        assertEquals("EN_ATTENTE", offre.getStatut());
    }

    @Test
    void testVerifierDisponibilite() {
        Offre offre = new Offre(1L, "Casablanca", "Rabat",
                new Date(), new Time(System.currentTimeMillis()), 50.0, 4);
        assertTrue(offre.verifierDisponibilite(2));
        assertFalse(offre.verifierDisponibilite(5));
        assertFalse(offre.verifierDisponibilite(0));
    }

    @Test
    void testAnnulerOffre() {
        Offre offre = new Offre();
        offre.annuler();
        assertEquals("ANNULEE", offre.getStatut());
    }
}