public abstract class Pret <T> {

    protected String id;
    protected double montant;
    protected double tauxInteret;

    public Pret(String id, double montant, double tauxInteret) {
        this.id = id;
        this.montant = montant;
        this.tauxInteret = tauxInteret;
    }

    public double calculerInteret(){
        return tauxInteret*montant;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", montant=" + montant +
                ", tauxInteret=" + tauxInteret;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
}
