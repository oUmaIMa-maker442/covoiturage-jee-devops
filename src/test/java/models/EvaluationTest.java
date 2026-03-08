package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

class EvaluationTest {

    @Test
    void testCreationEvaluation() {
        Evaluation e = new Evaluation();
        e.setNote(4);
        e.setCommentaire("Bon conducteur");
        assertEquals(4, e.getNote());
        assertEquals("Bon conducteur", e.getCommentaire());
    }

    @Test
    void testNoteValide() {
        Evaluation e = new Evaluation();
        e.setNote(5);
        assertTrue(e.getNote() >= 1 && e.getNote() <= 5);
    }

    @Test
    void testGetTrajetCompletSansVilles() {
        Evaluation e = new Evaluation();
        assertEquals("Trajet non spécifié", e.getTrajetComplet());
    }

    @Test
    void testGetTrajetCompletAvecVilles() {
        Evaluation e = new Evaluation();
        e.setVilleDepart("Casablanca");
        e.setVilleArrivee("Rabat");
        assertEquals("Casablanca -> Rabat", e.getTrajetComplet());
    }

    @Test
    void testGetEvaluateurComplet() {
        Evaluation e = new Evaluation();
        e.setEvaluateurNom("Lahkiar");
        e.setEvaluateurPrenom("Oumaima");
        assertEquals("Oumaima Lahkiar", e.getEvaluateurComplet());
    }
}