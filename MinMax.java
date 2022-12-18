class MinMax {

public static void main(String args[])
  {
      System.out.println("\nPlease enter eight numbers. Press enter after each number: ");       //Dem Benutzer wird gesagt, dass er acht Zahlen eingeben soll. Nach jeder Zahl Enter zu drücken ist hierbei wichtig.

      int a = In.readInt();                                  //Acht Zahlen werden nacheinander definiert und eingegeben
      int b = In.readInt();
      int c = In.readInt();
      int d = In.readInt();
      int e = In.readInt();
      int f = In.readInt();
      int g = In.readInt();
      int h = In.readInt();

      int max = a;                                          //Die Zahl a wird zu Beginn als höchste Zahl angegeben
      if(b > max){                                          //Dann wird überprüft, ob die Zahl b größer als a ist. Falls ja, dann wird b als neue höchste Zahl angegeben. Falls b nicht größer als a ist, bleibt a die größte Zahl.
          max = b;
        }
      if (c > max){                                         //Das gleiche wird nun mit c und den folgenden eingegebenen Zahlen gemacht. Falls c größer als die letzte, höchste Zahl (b) ist, dann ist c nun die höchste Zahl.
          max = c;
        }
      if (d > max){
          max = d;
        }
      if (e > max){
          max = e;
        }
      if (f > max){
          max = f;
        }
      if (g > max){
          max = g;
        }
      if (h > max){
          max = h;
        }

      System.out.println("\nThe maximum number is: " + max);        //Am Ende wird nun die Zahl angegeben, die laut der Durchführung als höchste Zahl gesehen wird.


      int min = a;                                                  //Nun wird wieder bei a begonnen und die kleinste Zahl herausgefunden. Hierfür wird statt > der umgedrehte Kleiner - Pfeil (<) benutzt.
      if(b < min){                                                  //Falls b nun kleiner als a ist, wird b als kleinste Zahl angesehen. Falls nicht, dann bleibt a die kleinste Zahl zu diesem Zeitpunkt im Programm.
          min = b;
        }
      if (c < min){
          min = c;
        }
      if (d < min){
          min = d;
        }
      if (e < min){
          min = e;
        }
      if (f < min){
          min = f;
        }
      if (g < min){
          min = g;
        }
      if (h < min){
          min = h;
        }


      System.out.println("\nThe minimum number is: " + min +"\n");    //die Kleinste Zahl wird ausgegeben.

  }

}
