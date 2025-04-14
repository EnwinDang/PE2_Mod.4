package Module4.M1_EenPaarBeestjes;
/*Maak een Huisdier, huisdieren hebben een gewicht, leeftijd en naam.
Zorg voor een constructor, getters, setters en een toString functie.

Maak vervolgens een klasse hond die hier van gaat overerven.
Honden nemen alles over van een Huisdier en voegen nog een stamboeknummer toe.
Voorzie ook hiervoor een constructor, getters, setters en een toString functie.

Maak om alles te testen enkele huisdieren en honden aan en kijk wat er gebeurt als je hun gegevens afdrukt.
 */
public class Huisdier {
    private double gewicht;
    private int leeftijd;
    private String naam;

    public Huisdier(double gewicht, int leeftijd, String naam) {
        this.gewicht = gewicht;
        this.leeftijd = leeftijd;
        this.naam = naam;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Huisdier gegevens: \nNaam: " +
                naam + "\nLeeftijd: " +
                leeftijd + "\nGewicht: " +
                gewicht + " kg";
    }
}
