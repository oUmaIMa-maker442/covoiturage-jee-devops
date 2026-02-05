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
}
