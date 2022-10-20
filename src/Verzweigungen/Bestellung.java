package Verzweigungen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bestellung {

    public static void bestellung(Scanner s){
        int index = 0;

        ArrayList<Integer> preis = new ArrayList<Integer>(Arrays.asList(5,3,1));
        ArrayList<String> product = new ArrayList<String>(Arrays.asList("Schrauben","Muttern", "Unterlegscheiben"));
        ArrayList<Integer> summen = new ArrayList<Integer>();

        for (String item:product) {
            System.out.println("Anzahl " + item);
            int tmp = s.nextInt();

            summen.add(tmp * preis.get(index++));
        }

        double sum = summen.stream().mapToDouble(a -> a).sum();


        System.out.println("Kontrollieren Sie Ihre Bestellung!");
        System.out.println("Gesamtbetrag: " + sum);
    }
}
