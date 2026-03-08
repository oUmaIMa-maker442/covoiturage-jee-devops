package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReservationTest {

    @Test
    void testReservationPlaces() {
        Reservation r = new Reservation();
        r.setNombrePlaces(2);
        assertEquals(2, r.getNombrePlaces());
    }

    @Test
    void testPlacesValides() {
        Reservation r = new Reservation();
        r.setNombrePlaces(1);
        assertTrue(r.getNombrePlaces() >= 1);
    }

    @Test
    void testStatutParDefaut() {
        Reservation r = new Reservation();
        assertEquals("CONFIRMEE", r.getStatut());
    }

    @Test
    void testAnnulerReservation() {
        Reservation r = new Reservation();
        r.annuler();
        assertEquals("ANNULEE", r.getStatut());
    }

    @Test
    void testPeutEtreAnnulee() {
        Reservation r = new Reservation();
        assertTrue(r.peutEtreAnnulee()); // statut = CONFIRMEE par défaut
        r.annuler();
        assertFalse(r.peutEtreAnnulee()); // statut = ANNULEE
    }
}