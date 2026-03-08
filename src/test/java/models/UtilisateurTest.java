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

    @Test
    void testEstActifParDefaut() {
        Utilisateur u = new Utilisateur();
        assertTrue(u.getEstActif());
    }

    @Test
    void testGetInitiales() {
        Utilisateur u = new Utilisateur("Lahkiar", "Oumaima", "o@mail.com", "pass", "0600000000");
        assertEquals("OL", u.getInitiales());
    }

    @Test
    void testGetPhotoProfilUrlDefaut() {
        Utilisateur u = new Utilisateur();
        assertEquals("images/avatars/default-avatar.png", u.getPhotoProfilUrl());
    }
}