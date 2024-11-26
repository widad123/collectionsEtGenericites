public class PretsPersonnel extends Pret{

    private String motif;

    public PretsPersonnel(String id, double montant, double tauxInteret, String motif) {
        super(id, montant, tauxInteret);
        this.motif = motif;
    }

    @Override
    public double calculerInteret() {
        int dureeFixe = 3;
        return super.calculerInteret()*dureeFixe;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    @Override
    public String toString() {
        return "PretsPersonnel : {" +
                "motif='" + motif + '\'' +
                super.toString()+"} ";
    }
}
