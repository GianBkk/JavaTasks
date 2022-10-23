package Verzweigungen;

import java.util.Scanner;

public class DampfMaschine {

    public static void run(Scanner s){

        double tLuft, tDampf, effizenz;

        System.out.println("Geben Sie die Lufttemparatur ein: ");
        tLuft = s.nextInt();
        System.out.println("Geben Sie die Dampftemparatur ein: ");
        tDampf = s.nextInt();

        if (tDampf >= 373){
            effizenz = 1 - tLuft/tDampf;
        } else effizenz = 0;



        System.out.println("Die Effzienz betraegt: " + effizenz);



    }


}
