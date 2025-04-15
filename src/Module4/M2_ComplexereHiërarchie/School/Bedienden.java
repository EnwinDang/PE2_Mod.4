package Module4.M2_ComplexereHiërarchie.School;

public class Bedienden extends Personeelslid{
    protected Lokaal lokaal;

    public Bedienden(String voornaam, String achternaam, Lokaal lokaal) {
        super(voornaam, achternaam, lokaal);
        this.lokaal = lokaal;
    }

    @Override
    public Lokaal getLokaal() {
        return lokaal;
    }

    @Override
    public void setLokaal(Lokaal lokaal) {
        this.lokaal = lokaal;
    }

    @Override
    public String toString() {
        return "-Bediende- \n" +
                "Naam:  " + getVoornaam() + " " + getAchternaam() + "\n" +
                lokaal;
    }
}
