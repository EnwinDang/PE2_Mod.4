package Module4.M2_ComplexereHiërarchie.School;

public class Student extends Persoon{
    private long studentennummer;
    private String richting;

    public Student(String voornaam, String achternaam, long studentennummer, String richting) {
        super(voornaam, achternaam);
        this.studentennummer = studentennummer;
        this.richting = richting;
    }

    public long getStudentennummer() {
        return studentennummer;
    }

    public void setStudentennummer(long studentennummer) {
        this.studentennummer = studentennummer;
    }

    public String getRichting() {
        return richting;
    }

    public void setRichting(String richting) {
        this.richting = richting;
    }

    @Override
    public String toString() {
        return  "-Student-" +
                "Studentennuummer: " + studentennummer +
                "\nRichting: " + richting;
    }
}
