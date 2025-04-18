package Module4.M2_ComplexereHiërarchie.School;
/*Voor de volgende opdracht kan het enorm helpen om op voorhand een schema te maken zodat je een idee hebt hoe alles in elkaar past.
Denk zelf na over de gepaste types en hoe alles in elkaar past.
We schrijven enkele classes die een school gaan voorstellen, hiervoor hebben we verschillende klassen (gniffel) nodig.

We hebben verschillende personen, de gezamelijke gegevens zoals een voor- en achternaam komen in een klasse Persoon.
verder hebben we nog specifiekere personen
Een Student is een Persoon en heeft verder nog een studentennummer en specialisatie (bv. TI, MCT, ...)
Docenten zijn personeelsleden met een specialisatie en lokaal
Bedienden zijn ook personeelsleden en hebben ook een lokaal
Een Lokaal bestaat uit een adres, gebouw (bv. blok A), een verdieping en lokaalnummer
Als uitdaging probeer je de volgende functies te laten werken:

Docenten begeleiden meerdere studenten, probeer er voor te zorgen dat een docent meerdere studenten toegewezen krijgt,
hiervoor kan je een array bekijken.
Bedienden kunnen een lokaal wijzigen van andere personeelsleden,
zorg er voor dat deze functie enkel binnen de school (package) gebruikt kan worden.
 */
public class Persoon {
    private String voornaam;
    private String achternaam;

    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    @Override
    public String toString() {
        return "-Persoonsgegevens- \n" +
                "Voornam: " + voornaam + "\n" +
                "Achternaam: " + achternaam;
    }
}
