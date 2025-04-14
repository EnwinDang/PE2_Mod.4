package Module3.E1_Cirkel;

public class Cirkel {
    private float straal;
    private String kleur;

    public Cirkel() {
        this.kleur = "wit";
        this.straal = 0;
    }
    public Cirkel(String kleur) {
        this.kleur = kleur;
        this.straal = 0;
    }
    public Cirkel(float straal) {
        this.straal = straal;
        this.kleur = "wit";
    }
    public Cirkel(float straal, String kleur) {
        this.straal = straal;
        this.kleur = kleur;
    }

    public float getStraal() {
        return straal;
    }

    public void setStraal(float straal) {
        this.straal = straal;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
    public void print(){
        System.out.println("Straal: " + this.straal + " Kleur: " + this.kleur);
    }
    public double geefOmtrek(){
        return 2 Math.PI * straal;
    }
    public double geefOppervlakte(){
        return Math.PI * straal * straal;
    }
}