package Module4.H1_Beestjes2Revengeance;

import java.time.LocalDate;


public class  Pinguin extends Vogel implements Zwemmend {
    public Pinguin(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public String maakGeluid() {
        return "skwaak skwaak skwaak";
    }

    @Override
    public void zwem() {
        System.out.println("Een pinguin kan zwemmen");
    }
}
