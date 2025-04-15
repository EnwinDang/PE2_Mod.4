package Module4.M2_ComplexereHiërarchie.School;

public abstract class Personeelslid extends Persoon {
    private Lokaal lokaal;

    public Personeelslid(String voornaam, String achternaam, Lokaal lokaal) {
        super(voornaam, achternaam);
        this.lokaal = lokaal;
    }

    public Lokaal getLokaal() {
        return lokaal;
    }

    public void setLokaal(Lokaal lokaal) {
        this.lokaal = lokaal;
    }

    @Override
    public String toString() {
        return "=Personeelslid= \n" +
                getVoornaam()+ " " + getAchternaam() +
                "\nLokaal: " + lokaal;
    }
}
