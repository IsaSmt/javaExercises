class Quersumme {

  public static void main(String args[]){

    int n = 0;                                //Bevor der Nutzer einen Wert eingibt, wird dieser definiert als 0
    boolean condition = false;                //Vorher festgelegter boolean Wert legt die Kondition fest, mit der in die while-Schleife gestartet wird

      while(condition == false){
        System.out.println("Bitte geben Sie eine positive ganze Zahl zwischen 1 und 9999 ein: \n");     //Nutzer soll Zahlenwert eingeben, der zwischen 1 und 9999 liegt.
        n = In.readInt();                           //Zahl wird eingelesen

    condition = ( (n < 10000) && (n > 0));      //Überprüfung ob Zahl zwischen 1 und 9999 liegt

      if (!condition) {                   //Falls eingegebener Wert nicht kleiner als 9999 oder größer als 1 ist, dann folgt:
        System.out.println("\nDie eingegebene Zahl liegt nicht zwischen 1 und 9999! ");      //Dem Benutzer wird mitgeteilt, dass die Zahl nicht im vorgegebenen Zahlenbereich liegt.
        }

      }

      System.out.println("\nIhre eingegebene Zahl ist: " + n + "\n");         //Falls Zahl korrekt zwischen 1 und 9999 liegt, wird hier der Code weiter ausgeführt.

        int b = 0;        //Definition der Zahlenwerte mit denen im Anschluss gerechnet wird
        int c = 0;
        int d = 0;
        int e = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;


        b = n % 10;       //Eingegebener Zahlenwert wird jeweils durch 10 geteilt und der Rest ergibt den Zahlenwert mit der die Quersumme berechnet wird
        n1 = n / 10;      //Der eingegebene Zahlenwert durch 10 geteilt ergibt die Zahl, mit der im nächsten Rechenschritt gearbeitet wird

        c = n1 % 10;      //Vorheriges Ergebnis wird erneut durch 10 geteilt und der Rest als Nummer für die Quersumme gespeichert.
        n2 = n1 /10;

        d = n2 % 10;      //obige Schritte werden wiederholt
        n3 = n2 /10;

        e = n3 % 10;
        n4 = n3 /10;

        int s = 0;            //Quersumme
        s = b + c + d + e;    //Letztendlich wird die Quersumme berechnet aus den Modulo-Werten von oben

        System.out.println("Die Quersumme ergibt sich aus: " + e + " + " + d + " + " + c + " + " + b + " = " + s + "\n");     //Jeweilige Werte mit denen die Quersumme berechnet wird werden auf der Konsole ausgegeben

    }

}
