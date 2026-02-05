package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OffreTest {

    @Test
    void testOffreCreation() {
        Offre offre = new Offre();
        offre.setVilleDepart("Casablanca");
        offre.setVilleArrivee("Rabat");
        offre.setPrix(50);

        assertEquals("Casablanca", offre.getVilleDepart());
        assertEquals("Rabat", offre.getVilleArrivee());
        assertEquals(50, offre.getPrix());
    }

    @Test
    void testPrixPositif() {
        Offre offre = new Offre();
        offre.setPrix(30);

        assertTrue(offre.getPrix() > 0);
    }
}
