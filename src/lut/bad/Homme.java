package lut.bad;

public class Homme extends Humain {
    private String nom;
    private String prenom;
    private int age;

    public Homme (String nom,String prenom, int age ){
        super(nom,prenom,age);
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " " + age + "ans";
    }
}





