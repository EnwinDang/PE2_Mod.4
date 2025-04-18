package Module4.H1_Beestjes2Revengeance;

import java.time.LocalDate;

public class Tijger extends Zoogdier implements Zwemmend {
    public Tijger(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public String maakGeluid() {
        return "roar roar roar";
    }

    @Override
    public void zwem() {
        System.out.println("Een tijger kan zwemmen");
    }

    @Override
    public String toString() {
        return "Tijger geboren op: " + getGeboorteDatum();
    }
}
