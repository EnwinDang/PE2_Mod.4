package Module4.H1_Beestjes2Revengeance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
//Arraylist nog niet geleerd, toch gebruikt in de video op youtube.
public class DierMain {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        Dier vleermuis = new Vleermuis(date1);
        Dier eend = new Eend(date1);
        Dier pinguin = new Pinguin(date1);
        Dier tijger = new Tijger(date1);
        Dier kikker = new Kikker(date1);
        Dier slang = new Slang(date1);
        Dier zalm = new Zalm(date1);

        // Lijsten aanmaken
        ArrayList<Vliegend> kooi = new ArrayList<>();
        ArrayList<Zwemmend> vijver = new ArrayList<>();

        // Voeg dieren toe aan de juiste lijst op basis van interface
        if (vleermuis instanceof Vliegend vliegend) kooi.add(vliegend);
        if (eend instanceof Vliegend vliegend) kooi.add(vliegend);
        if (pinguin instanceof Vliegend vliegend) kooi.add(vliegend); // pinguin kan meestal niet vliegen, tenzij jij dat zo hebt gedaan :)

        if (eend instanceof Zwemmend zwemmend) vijver.add(zwemmend);
        if (pinguin instanceof Zwemmend zwemmend) vijver.add(zwemmend);
        if (tijger instanceof Zwemmend zwemmend) vijver.add(zwemmend);
        if (kikker instanceof Zwemmend zwemmend) vijver.add(zwemmend);
        if (zalm instanceof Zwemmend zwemmend) vijver.add(zwemmend);

        // Toon geluiden in de kooi
        System.out.println("Dieren in de kooi (vliegen):");
        for (Vliegend dier : kooi) {
            if (dier instanceof Dier d) {
                System.out.println(d.toString());
                System.out.println("Geluid: " + d.maakGeluid());
                dier.vlieg();
                System.out.println();
            }
        }

        // Toon geluiden in de vijver
        System.out.println("Dieren in de vijver (zwemmen):");
        for (Zwemmend dier : vijver) {
            if (dier instanceof Dier d) {
                System.out.println(d.toString());
                System.out.println("Geluid: " + d.maakGeluid());
                dier.zwem();
                System.out.println();
            }
        }
    }
}

