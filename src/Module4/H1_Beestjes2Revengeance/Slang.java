package Module4.H1_Beestjes2Revengeance;

import java.time.LocalDate;

public class Slang extends Amfibie implements Zwemmend {

    public Slang(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public String maakGeluid() {
        return "ssss sss sss";
    }

    @Override
    public void zwem() {
        System.out.println("Een slang kan zwemmen");
    }
}
