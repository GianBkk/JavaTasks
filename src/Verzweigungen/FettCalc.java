package Verzweigungen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FettCalc {
    public static void run(Scanner s){
        int index = 0;

        ArrayList<String> product = new ArrayList<String>(Arrays.asList(
                "A",
                "B"));
        ArrayList<Double> sum = new ArrayList<Double>();

        for (String item: product) {
            System.out.println("Preis pro Pfund Packung " + item);
            double preis = s.nextDouble();
            System.out.println("Prozent mageres Fleisch Packung " + item);
            int percent = s.nextInt();
            sum.add(preis* 100 / percent);
        }
        for (double item: sum) {
            System.out.println("Packung "+ product.get(index++) +" kostet pro Pfund mageres Fleisch: " + item);
        }
        if (sum.get(0) < sum.get(1)) System.out.println("Packung A ist preiswerter");
        else System.out.println("Packung B ist preiswerter");
    }
}
