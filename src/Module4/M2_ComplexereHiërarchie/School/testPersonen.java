package Module4.M2_ComplexereHiërarchie.School;

public class testPersonen {
    public static void main(String[] args) {
        Persoon persoon1 = new Persoon("Nguyen", "Dang");
        System.out.println(persoon1);
        Student student1 = new Student("Enwin", "Dang", 152033, "TI");
        System.out.println(student1);
        Lokaal lokaal5 = new Lokaal ("Banaanstraat 100", "gebouw A", 3, 303);
        Docent docent1 = new Docent("Pipi", "Kaka", lokaal5, "Chemie");
        System.out.println(docent1);
        Bedienden bediende1 = new Bedienden("Hard", "Worker", lokaal5);
        System.out.println(bediende1);
    }
}
