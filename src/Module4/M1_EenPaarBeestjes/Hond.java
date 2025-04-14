package Module4.M1_EenPaarBeestjes;
/*String voor stamboeknummer, potentieel letters*/
public class Hond extends Huisdier {
    private String stamboeknummer;

    public Hond(double gewicht, int leeftijd, String naam, String stamboeknummer) {
        super(gewicht, leeftijd, naam);
        this.stamboeknummer = stamboeknummer;
    }

    public String getStamboeknummer() {
        return stamboeknummer;
    }

    public void setStamboeknummer(String stamboeknummer) {
        this.stamboeknummer = stamboeknummer;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStamboeknummer: " + stamboeknummer;
    }
}
