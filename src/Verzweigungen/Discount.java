package Verzweigungen;

import java.util.Scanner;

public class Discount {

    public static void discount(){
        Scanner s = new Scanner(System.in);
        int betrag;
        double ergebnis;
        System.out.println("Geben Sie Gesamtbetrag ein ....");
        betrag = s.nextInt();
        if (betrag >= 10) ergebnis = betrag * 0.9;
        else ergebnis = betrag;
        System.out.println("Discountpreis: " + ergebnis);
    }

}
