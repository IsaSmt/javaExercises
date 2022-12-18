class Fakultaet_ID {
  public static void main(String args[]){

    int fakultaet;

    do {
      System.out.println("Bitte geben Sie einen Wert größer als Null und kleiner als 15 ein. Null beendet das Programm \n");
      fakultaet = In.readInt();

      switch(fakultaet) {
        case 0:
          break;
        case 1: case 2: case 3: case 4: case 5: case 6: case 8:
          System.out.println("\nTechnik\n");
          break;
        case 7: case 9: case 10: case 14:
          System.out.println("\nWirtschaft\n");
          break;
        case 11:
          System.out.println("\nSoziales\n");
          break;
        case 12:
          System.out.println("\nDesign\n");
          break;
        case 13:
          System.out.println("\nStudium Generale\n");
          break;
        default:
          System.out.println("\nUnbekannt\n");
      }
    }
    while(fakultaet != 0);
  }
}
