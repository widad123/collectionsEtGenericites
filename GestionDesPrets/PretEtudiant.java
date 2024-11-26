public class PretEtudiant extends Pret {

    private boolean differé;

    public PretEtudiant(String id, double montant, double tauxInteret, boolean differé) {
        super(id, montant, tauxInteret);
        this.differé = differé;
    }

    @Override
    public double calculerInteret() {
        int duree = 5;
        if (!differé){
            return super.calculerInteret()*duree;
        }
        return super.calculerInteret();
    }

    public boolean isDifferé() {
        return differé;
    }

    public void setDifferé(boolean differé) {
        this.differé = differé;
    }

    @Override
    public String toString() {
        return "PretEtudiant : {" +
                "differé=" + differé +
                super.toString()+"} ";
    }
}
