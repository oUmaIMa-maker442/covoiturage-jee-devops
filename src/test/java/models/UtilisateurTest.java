package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UtilisateurTest {

    @Test
    void testCreationUtilisateur() {
        Utilisateur u = new Utilisateur();
        u.setEmail("test@mail.com");
        u.setMotDePasse("123456");

        assertEquals("test@mail.com", u.getEmail());
        assertEquals("123456", u.getMotDePasse());
    }

    @Test
    void testEmailNotNull() {
        Utilisateur u = new Utilisateur();
        u.setEmail("user@mail.com");

        assertNotNull(u.getEmail());
    }
}
