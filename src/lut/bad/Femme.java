package lut.bad;

public class Femme extends Humain{
    private String nom;
    private String prenom;
    private int age;

    public Femme(String nom, String prenom, int age) {
        super(nom,prenom,age);
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " " + age + "ans";
    }
}
