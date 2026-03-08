package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AdministrateurTest {

    @Test
    void testCreationAdministrateur() {
        Administrateur a = new Administrateur("Admin", "Super", "admin@mail.com", "admin123", "0600000000");
        assertEquals("Admin", a.getNom());
        assertEquals("admin@mail.com", a.getEmail());
    }

    @Test
    void testValiderOffre() {
        Administrateur a = new Administrateur();
        assertTrue(a.validerOffre(1L));
    }

    @Test
    void testRejeterOffre() {
        Administrateur a = new Administrateur();
        assertTrue(a.rejeterOffre(1L, "Non conforme"));
    }

    @Test
    void testBloquerUtilisateur() {
        Administrateur a = new Administrateur();
        assertTrue(a.bloquerUtilisateur(2L));
    }

    @Test
    void testDebloquerUtilisateur() {
        Administrateur a = new Administrateur();
        assertTrue(a.debloquerUtilisateur(2L));
    }
}