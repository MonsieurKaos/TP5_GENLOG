package tests;

import static org.junit.Assert.*;

import app.DossierBancaire;

import org.junit.Test;

public class DossierBancaireTests {

    @Test
    public void testDepot() {
        DossierBancaire dossier = new DossierBancaire();
        dossier.deposer(100);
        assertEquals(100, dossier.getSolde(), 0);
    }
}
