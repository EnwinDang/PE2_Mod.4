package Module3.E1_Cirkel;

public class Main {
    public static void main(String[] args) {
        Cirkel c = new Cirkel(10, "blauw");
        c.print();
        System.out.println(c.geefOmtrek());
        System.out.println(c.geefOppervlakte());
    }
}
