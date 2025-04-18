package Module4.H1_Beestjes2Revengeance;

import java.time.LocalDate;
import java.util.Date;

public class Eend extends Vogel implements Vliegend, Zwemmend {

    public Eend(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public String maakGeluid() {
        return "kwak kwak kwak";
    }

    @Override
    public void vlieg() {
        System.out.println("Een eend kan vliegen");
    }

    @Override
    public void zwem() {
        System.out.println("Een eend kan zwemmen");
    }
}
