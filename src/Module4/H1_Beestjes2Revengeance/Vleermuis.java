package Module4.H1_Beestjes2Revengeance;

import java.time.LocalDate;

public class Vleermuis extends Zoogdier implements Vliegend {
    public Vleermuis(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public String maakGeluid() {
       return "chiiii chiii chiii";
    }

    @Override
    public void vlieg() {
        System.out.println("Een vleermuis kan vliegen");
    }
}
