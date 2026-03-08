package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NotificationTest {

    @Test
    void testCreationNotification() {
        Notification n = new Notification(1L, "Votre réservation est confirmée");
        assertEquals(1L, n.getIdUtilisateur());
        assertEquals("Votre réservation est confirmée", n.getMessage());
    }

    @Test
    void testEstLueParDefaut() {
        Notification n = new Notification();
        assertFalse(n.getEstLue());
    }

    @Test
    void testMarquerCommeLue() {
        Notification n = new Notification(1L, "Test");
        n.setEstLue(true);
        assertTrue(n.getEstLue());
    }

    @Test
    void testDateEnvoiNonNull() {
        Notification n = new Notification(1L, "Test");
        assertNotNull(n.getDateEnvoi());
    }
}