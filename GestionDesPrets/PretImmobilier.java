public class PretImmobilier extends Pret {

    private int duree;

    public PretImmobilier(String id, double montant, double tauxInteret, int duree) {
        super(id, montant, tauxInteret);
        this.duree = duree;
    }

    @Override
    public double calculerInteret() {
        return super.calculerInteret()*duree;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "PretImmobilier : {" +
                "duree=" + duree +
                 super.toString()+"} ";
    }
}
