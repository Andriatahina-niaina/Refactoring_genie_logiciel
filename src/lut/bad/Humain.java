package lut.bad;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;

    public Humain (String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void details () {
        System.out.println(this.toString());
    }

    /// /////////////////////////////////////////////////////////////////////////////////
    @Override
    public void manger() {
        System.out.println("je mange.");
    }

    @Override
    public void boire () {
        System.out.println("Je bois");
    }
    /// ///////////////////////////////////////////////////////////////////////////////

    public void ami (Humain autre, int dureeAmitie) {
        System.out.println(this.nom + " est ami avec " + autre.nom + "depuis"
        + dureeAmitie +"jours");
    }

    public void ami(Humain autre) {
        ami(autre,100);
    }
}
