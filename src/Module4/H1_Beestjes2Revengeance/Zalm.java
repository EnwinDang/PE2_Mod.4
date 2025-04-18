package Module4.H1_Beestjes2Revengeance;

import java.time.LocalDate;

public class Zalm extends Vis implements Zwemmend {
    public Zalm(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public String maakGeluid() {
        return "blub blub blub";
    }

    @Override
    public void zwem() {
        System.out.println("Een zalm kan zwemmen");
    }
}
