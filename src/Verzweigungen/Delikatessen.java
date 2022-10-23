package Verzweigungen;

import java.util.*;

public class Delikatessen {

    public static void run(Scanner s) {
        boolean ordering = true;
        int sum = 0;

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Schoki", 5);
        map.put("Erdbeer-Kuchen", 15);
        map.put("Schoki-Kuchen", 20);
        map.put("Muffin", 20);
        map.put("Kaffee", 10);
        map.put("Tee", 10);

        System.out.println(map.keySet());

        HashMap<String, Integer> wagen = new HashMap<>();


        System.out.println("Sam & Ellas Delikatessen-Versand");
        while(ordering){

            mainMenu();
            String input = s.nextLine();

            if (input.equals("1")) getAllItems(map);
            else if (map.containsKey(input)) {
                addItem(wagen, map, input, s);
            } else if (input.equals("2")) {
                ordering = getAllWagen(wagen, s, ordering);
            }
        }

        rechnung(wagen, sum, s, ordering);



    }

    public static void getAllItems(HashMap<String, Integer> map){
        map.forEach((k,v)  -> System.out.println("Item: " + k + " Preis: " + v + " Euro \n"));
    }
    public static boolean getAllWagen(HashMap<String, Integer> wagen, Scanner s, boolean ordering){
        if(wagen.isEmpty()) System.out.println("Nicht im Einkaufswagen!");
        else wagen.forEach((k,v)  -> System.out.println("Item: " + k + " Preis: " + v));

        if (ordering) {
            System.out.println("Weiter Einkaufen(1) Auszahlen(2)");
            String input = s.nextLine();
            if (input.equals("2")) {
                return false;
            } else return true;
        }else return false;
    }
    public static void addItem(HashMap<String, Integer> wagen, HashMap<String, Integer> map, String input, Scanner s){
        System.out.println("Item will be added: "+ input + ": " + map.get(input) + " Euro");
        System.out.println("Sind Sie sich Sicher?(Y/N)");
        String answer = s.nextLine().toLowerCase();
        if (answer.equals("y")){
            wagen.put(input, map.get(input));
            System.out.println("Item added: "+ input + ": " + map.get(input) + " Euro\n");
        }else System.out.println("Nothing Added!");
    }
    public static void mainMenu(){
        System.out.println("");
        System.out.println("Was moechten sie machen?");
        System.out.println("(1)Liste aller Delikatessen anzeigen (2)Einkaufswagen ([name_Delikatessen])Einkaufswagen hinzufuegen ..");
    }

    public static void rechnung(HashMap<String, Integer> wagen, int sum, Scanner s, boolean ordering){
        if (!wagen.isEmpty()){
            int versand;
            int express = 0;

            for (int price : wagen.values()) {
                sum += price;
            }
            if (sum >= 10) versand = 3;
            else versand = 2;
            System.out.println("Versandkosten betragen: " + versand + " Euro");
            System.out.println("Moechten Sie expressVersand fuer eine 5 Euro zuschlag (Y)");
            String input = s.nextLine().toLowerCase();
            if (input.equals("y")) express = 5;

            System.out.println("Rechnung:");
            getAllWagen(wagen, s, ordering);
            sum = sum + versand + express;
            System.out.println("Summe: " + sum + " Euro\n");
            System.out.println("Danke fuer ihren Einkauf!");

        }
        else System.out.println("Sie haben nichts gekauft!");
    }


}
