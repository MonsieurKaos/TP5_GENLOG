package app;

public class DossierBancaire {

    private double m_solde;

    public DossierBancaire() {
        m_solde = 0;
    }

    public void deposer(double value) {
        m_solde += value;
    }

    public double getSolde() {
        return m_solde;
    }

    public void remunerer() {
    }
}
