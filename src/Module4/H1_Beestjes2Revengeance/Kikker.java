package Module4.H1_Beestjes2Revengeance;

import java.time.LocalDate;

public class Kikker extends Amfibie implements Zwemmend {

    public Kikker(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public String maakGeluid() {
        return "ribbit ribbit ribbit";
    }

    @Override
    public void zwem() {
        System.out.println("Een kikker kan zwemmen");
    }
}
