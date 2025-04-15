package Module4.M2_ComplexereHiërarchie.School;

import static java.awt.SystemColor.info;

public class Docent extends Personeelslid{
    private Student[] studenten = new Student[100];
    private int aantalStudenten;
    private String richting;

    public Docent(String voornaam, String achternaam, Lokaal lokaal, String richting) {
        super(voornaam, achternaam, lokaal);
        this.richting = richting;
        studenten = new Student[100];
    }
    public Student[] getStudenten() {
        return studenten;
    }

    public void addStudent(Student student) {
        if(aantalStudenten < studenten.length) {
            studenten[aantalStudenten] = student;
            aantalStudenten++;
        }else{
            System.out.println("MAX limit");
        }
    }

    public String getRichting() {
        return richting;
    }

    public void setRichting(String richting) {
        this.richting = richting;
    }
    public int getAantalStudenten() {
        return aantalStudenten;
    }
}
