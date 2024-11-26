public class Main {
    public static void main(String[] args) {
        GestionnaireDePrets gest = new GestionnaireDePrets();
        gest.ajouterPret(new PretEtudiant("P002",1500.0,0.02,true));
        gest.ajouterPret(new PretsPersonnel("P003",5000.0,0.05,"Voyage"));
        gest.ajouterPret(new PretImmobilier("P001",200000.0,0.03,20));
        System.out.println("Liste des prêts : ");
        gest.listerPrets().forEach(System.out::println);
        System.out.println("Nombre total des prêts : ");
        System.out.println(gest.compterPrets());
        System.out.println("Retrait du prêt :" + gest.retirerPret());
        System.out.println("Liste mise à jour :");
        gest.listerPrets().forEach(System.out::println);
    }
}
