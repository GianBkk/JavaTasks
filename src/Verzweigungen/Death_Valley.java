package Verzweigungen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Death_Valley {

    public static void run(Scanner s){
        ArrayList<String> product = new ArrayList<String>(Arrays.asList("Tankkapazität","Benzinanzeige", "Meilen pro Gallone"));
        ArrayList<Integer> eingabe = new ArrayList<Integer>();

        for (String item: product) {
            System.out.println(item + ":");
            eingabe.add(s.nextInt());
        }
        int sum = 200 - (eingabe.get(2) * eingabe.get(0) * eingabe.get(1) / 100);
        if (sum > 0) System.out.println("Tanken!");
        else System.out.println("Weiterfahren ....");

    }
}
